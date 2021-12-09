data class TodoItem(
    val title: String,
    val completed: Boolean = false
)

fun Composer.TodoItem(item: TodoItem) {
    emit(memo { Stack(Orientation.Horizontal) }) {
        emit(
            memo(item.completed) {
                Text(if (item.completed) "x" else " ")
            }
        )
        emit(
            memo(item.title) {
                Text(item.title)
            }
        )
    }
}

fun Composer.TodoApp(items: List<TodoItem>) {
    emit(memo { Stack(Orientation.Vertical) }) {
        for (item in items) {
            TodoItem(item)
        }
    }
}