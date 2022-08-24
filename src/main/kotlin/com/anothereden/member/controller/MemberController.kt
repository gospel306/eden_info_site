package com.anothereden.member.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/member")
class MemberController {

    @PostMapping("/login")
    fun login(): ResponseEntity<Any>{
        return ResponseEntity.ok().body(null)
    }

    @PostMapping("/join")
    fun join(): ResponseEntity<Any>{
        return ResponseEntity.ok().body(null)
    }
}