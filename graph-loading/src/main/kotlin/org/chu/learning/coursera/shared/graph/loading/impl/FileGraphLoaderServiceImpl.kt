package org.chu.learning.coursera.shared.graph.loading.impl

import org.chu.learning.coursera.shared.graph.loading.AbstractFileGraphLoaderService
import org.chu.learning.coursera.shared.graph.loading.GraphDefinitionLineParser
import org.chu.learning.coursera.shared.graph.loading.GraphLoaderService
import org.chu.learning.coursera.shared.graph.model.Graph
import java.io.BufferedReader
import java.io.InputStreamReader
import java.nio.file.Files
import java.nio.file.Paths

private class FileGraphLoaderServiceImpl(fileName: String, private val lineParser: GraphDefinitionLineParser) : AbstractFileGraphLoaderService(fileName) {
    override fun loadGraph(): Graph {
        val reader = openSourceFile()

        val vCount = reader.readLine().toInt()
        val graph = Graph(vCount)

        reader.forEachLine { line -> lineParser.parseLine(graph, line) }

        return graph
    }
}