package org.chu.learning.coursera.shared.graph.model

import org.chu.learning.coursera.shared.graph.impl.EdgeImpl
import org.chu.learning.coursera.shared.graph.impl.VertexImpl
import org.chu.learning.coursera.shared.graph.operation.GraphOperation
import org.chu.learning.coursera.shared.graph.visualization.Visualizer
import java.util.LinkedList

class Graph(verticesCount: Int): MutableGraph {
    private var vCount = verticesCount
    private val V: Array<VertexImpl?> = Array(verticesCount, { i -> null})
    private val E: MutableList<EdgeImpl> = LinkedList()

    fun addVertex(vertex: VertexImpl) {
        V[vertex.getId()] = vertex
    }

    fun hasVertex(id: Int): Boolean = V.getOrNull(id) != null;

    fun getVertex(id: Int): VertexImpl? = V[id]

    fun addEdge(edge: EdgeImpl) {
        E.add(edge)
    }

    fun getEdge(index: Int) = E[index]

    fun getVerticesCount() = vCount

    fun getEdgesCount() = E.size

    override fun getVertices(): Array<VertexImpl?> = V

    override fun getEdges(): MutableList<EdgeImpl> = E

    override fun decrementVerticesCount() {
        vCount--
    }

    fun applyOperation(operation: GraphOperation) {
        operation.execute(this)
    }

    fun visualize(visualizer: Visualizer) = visualizer.visualize(V.iterator(), E.iterator())

    fun copy(): Graph {
        val copy = Graph(vCount)

        V.forEach { v -> copy.addVertex(VertexImpl(v!!.getId())) }

        E.forEach { e -> copy.addEdge(EdgeImpl(copy.V[e.getTail().getId()]!!, copy.V[e.getHead().getId()]!!)) }

        return copy
    }
}