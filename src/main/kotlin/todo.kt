data class TodoItem(
    val title: String,
    val completed: Boolean = false
)

fun Composer.TodoItem(item: TodoItem) {
    emit(Stack(Orientation.Horizontal)) {
        emit(Text(if (item.completed) "x" else " "))
        emit(Text(item.title))
    }
}

fun Composer.TodoApp(items: List<TodoItem>) {
    emit(Stack(Orientation.Vertical)) {
        for (item in items) {
            TodoItem(item)
        }
    }
}