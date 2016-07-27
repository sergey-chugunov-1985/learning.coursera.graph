package org.chu.learning.coursera.shared.graph.loading.test

import org.chu.learning.coursera.shared.graph.loading.impl.DefaultGraphDefinitionLineParserFactory
import org.chu.learning.coursera.shared.graph.model.Graph
import org.junit.Test

class GraphLoadingTest {
    @Test fun stringParsingTest() {
        val graph = Graph(2)

        val lineParser = DefaultGraphDefinitionLineParserFactory.newInstance().getDefaultGraphDefinitionLineParser()

        lineParser.parseLine(graph, "1 2")

        val tailVertex = graph.getVertex(0)
        val headVertex = graph.getVertex(1)

        assert(tailVertex!!.getEdges().size == 1)
        assert(tailVertex.getEdges()[0].getHead().equals(headVertex))
        assert(headVertex!!.getEdges().size == 0)

        lineParser.parseLine(graph, "2 1")

        assert(tailVertex.getEdges().size == 1)
        assert(tailVertex.getEdges()[0].getHead().equals(headVertex))
        assert(headVertex.getEdges().size == 1)
        assert(headVertex.getEdges()[0].getHead().equals(tailVertex))
    }

    @Test fun loadingFromFileTest() {

    }
}