package org.chu.learning.coursera.shared.graph.model

interface Edge {
    fun getHead(): Vertex

    fun getTail(): Vertex
}