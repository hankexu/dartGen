package com.github.hankexu.dartgen.services

import com.intellij.openapi.project.Project
import com.github.hankexu.dartgen.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
