data class TodoItem(
    val title: String,
    val completed: Boolean = false
)

fun Composer.TodoItem(item: TodoItem) {
    emit({ Stack(Orientation.Horizontal) }) {
        emit(
            { Text() },
            { memo(item.completed) { it.text = if (item.completed) "x" else " " } }
        )
        emit(
            { Text() },
            { memo(item.title) { it.text = item.title } }
        )
    }
}

fun Composer.TodoApp(items: List<TodoItem>) {
    emit({ Stack(Orientation.Vertical) }) {
        for (item in items) {
            TodoItem(item)
        }
    }
    val text = "Total: ${items.size} items"
    emit(
        { Text() },
        { memo(text) { it.text = text }}
    )
}