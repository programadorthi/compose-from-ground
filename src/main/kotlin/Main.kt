import kotlin.random.Random

fun compose(content: Composer.() -> Unit): Node {
    return Stack(Orientation.Vertical).also {
        ComposerImpl(it).apply(content)
    }
}

fun renderNodeToScreen(node: Node) {
    node.render()
}

fun main() {
    val random = Random.Default
    val items = mutableListOf<TodoItem>()
    repeat(3) {
        items += TodoItem("Title $it", random.nextBoolean())
    }
    renderNodeToScreen(compose { TodoApp(items) })
}