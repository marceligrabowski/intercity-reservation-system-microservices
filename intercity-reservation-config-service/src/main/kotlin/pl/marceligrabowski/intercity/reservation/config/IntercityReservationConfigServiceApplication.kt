package pl.marceligrabowski.intercity.reservation.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
class IntercityReservationConfigServiceApplication

fun main(args: Array<String>) {
    runApplication<IntercityReservationConfigServiceApplication>(*args)
}
