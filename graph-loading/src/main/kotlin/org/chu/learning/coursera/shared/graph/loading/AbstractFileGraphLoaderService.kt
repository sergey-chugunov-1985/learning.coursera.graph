package org.chu.learning.coursera.shared.graph.loading

import java.io.BufferedReader
import java.io.InputStreamReader
import java.nio.file.Files
import java.nio.file.Paths

abstract class AbstractFileGraphLoaderService(private val fileName: String): GraphLoaderService {

    protected fun openSourceFile() = BufferedReader(InputStreamReader(Files.newInputStream(Paths.get(fileName))))
}