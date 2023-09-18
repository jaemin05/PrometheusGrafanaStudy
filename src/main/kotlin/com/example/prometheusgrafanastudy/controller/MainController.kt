package com.example.prometheusgrafanastudy.controller

import io.micrometer.core.annotation.Timed
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableAutoConfiguration
class MainController {

    @Timed(value = "doMain")
    @RequestMapping
    fun doMain(): String {
        return "[Monitoring] Hello. This is Prometheus + Grafana Study Main Page."
    }

    @Timed(value = "doEndpoint1")
    @RequestMapping("/endpoint1")
    fun doEndpoint1(): String {
        return "[Monitoring] Hello. This is Endpoint1."
    }

    @Timed(value = "doEndpoint2")
    @RequestMapping("/endpoint2")
    fun doEndpoint2(): String {
        return "[Monitoring] Hello. This is Endpoint2."
    }
}