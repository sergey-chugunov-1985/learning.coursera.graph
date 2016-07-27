package org.chu.learning.coursera.shared.graph.model

import org.chu.learning.coursera.shared.graph.impl.EdgeImpl

interface MutableVertex {
    fun addEdge(edge: EdgeImpl): Boolean

    fun removeEdge(edge: EdgeImpl): Boolean
}