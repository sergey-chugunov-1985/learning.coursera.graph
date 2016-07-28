package org.chu.learning.coursera.shared.graph.model

import org.chu.learning.coursera.shared.graph.impl.EdgeImpl

interface Vertex: AttributesHolder {
    fun getId(): Int

    fun getEdges(): List<EdgeImpl>
}