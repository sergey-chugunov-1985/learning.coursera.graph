package org.chu.learning.coursera.shared.graph.operation

import org.chu.learning.coursera.shared.graph.model.MutableGraph

abstract class AbstractGraphOperation: GraphOperation {

    private var graphOperation: GraphOperation? = null

    override fun combineWith(graphOperation: GraphOperation): GraphOperation {
        this.graphOperation = graphOperation
        return this
    }

    override fun execute(graph: MutableGraph) {
        executeOperation(graph)
        graphOperation?.execute(graph)
    }

    abstract fun executeOperation(graph: MutableGraph)
}