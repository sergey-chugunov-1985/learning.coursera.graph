package org.chu.learning.coursera.shared.graph.operation

import org.chu.learning.coursera.shared.graph.model.MutableGraph

interface GraphOperation {
    fun execute(graph: MutableGraph)

    fun combineWith(graphOperation: GraphOperation): GraphOperation
}