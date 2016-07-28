package org.chu.learning.coursera.shared.graph.model

interface Edge: AttributesHolder {
    fun getHead(): Vertex

    fun getTail(): Vertex
}