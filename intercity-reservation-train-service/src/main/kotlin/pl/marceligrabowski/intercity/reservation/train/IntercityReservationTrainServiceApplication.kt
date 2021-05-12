package pl.marceligrabowski.intercity.reservation.train

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IntercityReservationTrainServiceApplication

fun main(args: Array<String>) {
    runApplication<IntercityReservationTrainServiceApplication>(*args)
}
