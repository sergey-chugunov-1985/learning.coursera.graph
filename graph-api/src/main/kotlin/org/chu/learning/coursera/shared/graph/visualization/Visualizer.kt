package org.chu.learning.coursera.shared.graph.visualization

import org.chu.learning.coursera.shared.graph.impl.EdgeImpl
import org.chu.learning.coursera.shared.graph.impl.VertexImpl

interface Visualizer {
    fun visualize(verticesIterator: Iterator<VertexImpl?>, edgesIterator: Iterator<EdgeImpl>)

    fun chainVisualizer(visualizer: Visualizer): Visualizer
}