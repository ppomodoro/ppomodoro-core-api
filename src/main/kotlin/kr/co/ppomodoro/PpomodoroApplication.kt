package kr.co.ppomodoro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PpomodoroApplication

fun main(args: Array<String>) {
    runApplication<PpomodoroApplication>(*args)
}
