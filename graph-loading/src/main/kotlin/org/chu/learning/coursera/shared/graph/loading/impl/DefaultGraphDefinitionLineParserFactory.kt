package org.chu.learning.coursera.shared.graph.loading.impl

class DefaultGraphDefinitionLineParserFactory {
    companion object {
        fun newInstance() = DefaultGraphDefinitionLineParserFactory()
    }

    fun getDefaultGraphDefinitionLineParser(): VertexCentricGraphDefinitionLineParserImpl {
        return VertexCentricGraphDefinitionLineParserImpl()
    }
}