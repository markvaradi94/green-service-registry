package ro.asis.green.service.registry

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class GreenServiceRegistryApplication

fun main(args: Array<String>) {
    runApplication<GreenServiceRegistryApplication>(*args)
}
