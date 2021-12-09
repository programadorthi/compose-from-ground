data class TodoItem(
    val title: String,
    val completed: Boolean = false
)

fun TodoApp(items: List<TodoItem>): Node {
    return Stack(Orientation.Vertical).apply {
        for (item in items) {
            children.add(Stack(Orientation.Horizontal).apply {
                children.add(Text(if (item.completed) "x" else " "))
                children.add(Text(item.title))
            })
        }
    }
}