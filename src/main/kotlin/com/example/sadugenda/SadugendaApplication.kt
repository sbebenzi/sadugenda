package com.example.sadugenda

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.jdbc.core.JdbcTemplate
import javax.sql.DataSource

@SpringBootApplication
open class SadugendaApplication

fun main(args: Array<String>) {
	runApplication<SadugendaApplication>(*args)
}
@Bean
fun jdbcTemplate(dataSource: DataSource): JdbcTemplate {
	return JdbcTemplate(dataSource)
}