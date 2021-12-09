import kotlin.random.Random

fun renderNodeToScreen(node: Node) {
    node.render()
}

fun main() {
    val random = Random.Default
    val items = mutableListOf<TodoItem>()
    repeat(3) {
        items += TodoItem("Title $it", random.nextBoolean())
    }
    renderNodeToScreen(TodoApp(items))
}