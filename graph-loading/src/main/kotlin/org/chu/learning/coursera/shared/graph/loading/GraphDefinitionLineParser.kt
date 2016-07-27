package org.chu.learning.coursera.shared.graph.loading

import org.chu.learning.coursera.shared.graph.model.Graph

interface GraphDefinitionLineParser {
    fun parseLine(loadingGraph: Graph, line: String)
}