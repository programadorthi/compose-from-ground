fun renderNodeToScreen(node: Node) {
    node.render()
}

fun main(args: Array<String>) {
    renderNodeToScreen(Text("Hello Compose"))
}