package org.chu.learning.coursera.algo.part1.mincut.impl

import org.chu.learning.coursera.shared.graph.impl.EdgeImpl
import org.chu.learning.coursera.shared.graph.impl.VertexImpl
import org.chu.learning.coursera.shared.graph.visualization.Visualizer


class EdgesConsoleVisualizer : Visualizer {
    override fun chainVisualizer(visualizer: Visualizer): Visualizer {
        throw UnsupportedOperationException()
    }

    override fun visualize(verticesIterator: Iterator<VertexImpl?>, edgesIterator: Iterator<EdgeImpl>) {
        println("edges")
        for ((index, edge) in edgesIterator.withIndex())
            println("${index.toString()}: ${edge.toString()}")
    }
}