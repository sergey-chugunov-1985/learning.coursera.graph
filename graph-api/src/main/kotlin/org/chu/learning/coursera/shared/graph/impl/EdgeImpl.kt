package org.chu.learning.coursera.shared.graph.impl

import org.chu.learning.coursera.shared.graph.model.MutableEdge
import org.chu.learning.coursera.shared.graph.model.MutableVertex

class EdgeImpl: MutableEdge {
    private var tail: MutableVertex
    private var head: MutableVertex

    private var attributes: Any = Unit

    constructor(tail: MutableVertex, head: MutableVertex) {
        this.tail = tail
        this.head = head

        tail.addEdge(this)
    }

    override fun toString(): String {
        return "(${tail.getId()}, ${head.getId()})"
    }

    override fun getHead() = head

    override fun getTail() = tail

    override fun updateHead(newHead: MutableVertex) {
        this.head = newHead
    }

    override fun updateTail(newTail: MutableVertex) {
        this.tail = newTail
    }

    override fun reverseEdge() {
        val exchTail = tail

        tail.removeEdge(this)
        head.addEdge(this)

        this.tail = head
        this.head = exchTail
    }

    override fun getAttributes() = attributes

    override fun setAttributes(attributes: Any) {
        this.attributes = attributes
    }
}