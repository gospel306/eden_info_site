package com.anothereden.member.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/view")
class AccountController {

    @RequestMapping("success")
    fun success(request: HttpServletRequest): String {
        return "success"
    }
}