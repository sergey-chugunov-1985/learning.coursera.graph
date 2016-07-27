package org.chu.learning.coursera.shared.graph.loading.impl

import org.chu.learning.coursera.shared.graph.loading.AbstractGraphDefinitionLineParser
import org.chu.learning.coursera.shared.graph.impl.EdgeImpl
import org.chu.learning.coursera.shared.graph.model.Graph
import org.chu.learning.coursera.shared.graph.impl.VertexImpl

class VertexCentricGraphDefinitionLineParserImpl : AbstractGraphDefinitionLineParser() {
    override fun parseLine(loadingGraph: Graph, line: String) {
        val preprocessedLine = cleanUpLine(line)

        val lineSplit = preprocessedLine.split(DEFAULT_DELIMITER)

        var vertexId = lineSplit[0].toInt() - 1

        val tailVertex: VertexImpl

        if (!loadingGraph.hasVertex(vertexId)) {
            tailVertex = VertexImpl(vertexId)
            loadingGraph.addVertex(tailVertex)
        } else
            tailVertex = loadingGraph.getVertex(vertexId)!!

        for (i in 1..lineSplit.size - 1) {
            val nextVertexInfo = lineSplit[i]
            var edgeLength = -1
            if (!nextVertexInfo.contains(','))
                vertexId = nextVertexInfo.toInt() - 1
            else {
                val vertexInfoSplit = nextVertexInfo.split(',')
                vertexId = vertexInfoSplit[0].toInt() - 1
                edgeLength = vertexInfoSplit[1].toInt()
            }

            var nextHeadVertex: VertexImpl

            if (loadingGraph.hasVertex(vertexId))
                nextHeadVertex = loadingGraph.getVertex(vertexId)!!
            else {
                nextHeadVertex = VertexImpl(vertexId)
                loadingGraph.addVertex(nextHeadVertex)
            }

            loadingGraph.addEdge(EdgeImpl(tailVertex, nextHeadVertex, edgeLength))
        }
    }
}