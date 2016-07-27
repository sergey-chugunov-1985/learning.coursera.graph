package org.chu.learning.coursera.shared.graph.model

import org.chu.learning.coursera.shared.graph.impl.EdgeImpl

interface Vertex {
    fun getId(): Int

    fun getEdges(): List<EdgeImpl>
}