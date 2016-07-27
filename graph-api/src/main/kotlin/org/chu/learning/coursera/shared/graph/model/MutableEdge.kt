package org.chu.learning.coursera.shared.graph.model

import org.chu.learning.coursera.shared.graph.impl.VertexImpl

interface MutableEdge {
    fun updateTail(newTail: VertexImpl)

    fun updateHead(newHead: VertexImpl)

    fun reverseEdge()
}