package org.chu.learning.coursera.shared.graph.impl

import org.chu.learning.coursera.shared.graph.model.MutableVertex
import org.chu.learning.coursera.shared.graph.model.Vertex
import java.util.LinkedList

class VertexImpl(private val id: Int): MutableVertex {

    private val edges: MutableList<EdgeImpl> = LinkedList()

    private var attributes: Any = Unit

    override fun addEdge(edge: EdgeImpl) = edges.add(edge)

    override fun getId(): Int = id

    override fun getEdges() = edges

    override fun removeEdge(edge: EdgeImpl) = edges.remove(edge)

    override fun getAttributes() = attributes

    override fun setAttributes(attributes: Any) {
        this.attributes = attributes
    }

    override fun toString(): String {
        val strRep = StringBuilder()
        strRep.append(id.toString())
                .append(" -> ")

        for (edge in edges)
            strRep.append("[").append(edge.getHead().getId())
                    .append("]")

        return strRep.toString()
    }
}