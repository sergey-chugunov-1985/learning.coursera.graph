package org.chu.learning.coursera.shared.graph.model

import org.chu.learning.coursera.shared.graph.impl.EdgeImpl
import org.chu.learning.coursera.shared.graph.impl.VertexImpl

interface MutableGraph {

    fun getVertices(): Array<VertexImpl?>

    fun getEdges(): MutableList<EdgeImpl>

    fun decrementVerticesCount()
}