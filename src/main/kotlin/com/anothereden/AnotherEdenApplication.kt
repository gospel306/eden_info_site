package com.anothereden

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AnotherEdenApplication

fun main(args: Array<String>){
    runApplication<AnotherEdenApplication>(*args){
        setBannerMode(Banner.Mode.OFF)
    }

}