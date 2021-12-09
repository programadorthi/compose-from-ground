abstract class Node {
    val children = mutableListOf<Node>()

    abstract fun render()
}

enum class Orientation { Vertical, Horizontal }

class Stack(var orientation: Orientation) : Node() {
    override fun render() {
        println(">> $this -> $orientation")
        children.forEach { it.render() }
    }
}

class Text(var text: String) : Node() {
    override fun render() {
        println(">> $this -> $text")
        children.forEach { it.render() }
    }
}
