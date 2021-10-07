package com.peaksong.boot.kotlin.maven.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.peaksong.boot.kotlin.maven.model.Company
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CompanyController {

    @PostMapping
    fun company(): String {
        val com = Company()
        com.id = "1"
        com.name = "name"
        return ObjectMapper().writeValueAsString(com)
    }
}