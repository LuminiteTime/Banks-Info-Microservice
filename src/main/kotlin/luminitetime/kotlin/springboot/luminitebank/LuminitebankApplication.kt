package luminitetime.kotlin.springboot.luminitebank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LuminitebankApplication

fun main(args: Array<String>) {
	runApplication<LuminitebankApplication>(*args)
}
