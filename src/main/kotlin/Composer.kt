interface Composer {
    // add node as a child to the current Node, execute
    // `content` with `node` as the current Node
    fun emit(node: Node, content: () -> Unit = {})
}

class ComposerImpl(root: Node): Composer {
    private var current: Node = root

    override fun emit(node: Node, content: () -> Unit) {
        // store current parent to restore later
        val parent = current
        parent.children.add(node)
        current = node
        // with `current` set to `node`, we execute the passed in lambda
        // in the "scope" of it, so that emitted nodes inside of this
        // lambda end up as children to `node`.
        content()
        // restore current
        current = parent
    }
}