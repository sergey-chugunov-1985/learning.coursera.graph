package org.chu.learning.coursera.shared.graph.loading

abstract class AbstractGraphDefinitionLineParser: GraphDefinitionLineParser {

    protected val DEFAULT_DELIMITER = ' ';

    protected fun cleanUpLine(dirtyLine: String): String {
        return dirtyLine.replace('\t', DEFAULT_DELIMITER).trim()
    }
}