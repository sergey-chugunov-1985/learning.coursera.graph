package org.chu.learning.coursera.shared.graph.model

interface MutableEdge: Edge {
    fun updateTail(newTail: MutableVertex)

    fun updateHead(newHead: MutableVertex)

    fun reverseEdge()
}