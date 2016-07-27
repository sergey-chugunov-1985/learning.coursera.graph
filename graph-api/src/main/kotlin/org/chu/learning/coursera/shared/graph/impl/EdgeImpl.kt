package org.chu.learning.coursera.shared.graph.impl

import org.chu.learning.coursera.shared.graph.model.Edge
import org.chu.learning.coursera.shared.graph.model.MutableEdge

class EdgeImpl: Edge, MutableEdge {
    private var tail: VertexImpl
    private var head: VertexImpl

    private val length: Int

    constructor(tail: VertexImpl, head: VertexImpl, length: Int) {
        this.tail = tail
        this.head = head
        this.length = length

        tail.addEdge(this)
    }

    constructor(tail: VertexImpl, head: VertexImpl) {
        this.tail = tail
        this.head = head
        this.length = -1

        tail.addEdge(this)
    }

    override fun toString(): String {
        return "(${tail.getId()}, ${head.getId()}) of ${length}"
    }

    override fun getHead() = head

    override fun getTail() = tail

    fun getLength() = length

    override fun updateHead(newHead: VertexImpl) {
        this.head = newHead
    }

    override fun updateTail(newTail: VertexImpl) {
        this.tail = newTail
    }

    override fun reverseEdge() {
        val exchTail = tail

        tail.removeEdge(this)
        head.addEdge(this)

        this.tail = head
        this.head = exchTail
    }
}