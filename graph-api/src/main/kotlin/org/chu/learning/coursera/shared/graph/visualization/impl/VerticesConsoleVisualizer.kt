package org.chu.learning.coursera.algo.part1.mincut.impl

import org.chu.learning.coursera.shared.graph.impl.EdgeImpl
import org.chu.learning.coursera.shared.graph.impl.VertexImpl
import org.chu.learning.coursera.shared.graph.visualization.Visualizer


class VerticesConsoleVisualizer: Visualizer {

    private var nextVisualizer: Visualizer? = null

    override fun visualize(verticesIterator: Iterator<VertexImpl?>, edgesIterator: Iterator<EdgeImpl>) {
        println("vertices")
        for (vertex in verticesIterator)
            println(vertex.toString())

        if (nextVisualizer != null)
            println()
        nextVisualizer?.visualize(verticesIterator, edgesIterator)
    }

    override fun chainVisualizer(visualizer: Visualizer): Visualizer {
        nextVisualizer = visualizer
        return this
    }
}