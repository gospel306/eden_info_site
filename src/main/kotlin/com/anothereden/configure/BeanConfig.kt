package com.anothereden.configure

import com.anothereden.member.model.account.Account
import com.anothereden.member.model.account.AccountRole
import com.anothereden.member.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.crypto.factory.PasswordEncoderFactories
import org.springframework.security.crypto.password.PasswordEncoder

@Configuration
class BeanConfig {
    @Bean
    fun passwordEncoder(): PasswordEncoder{
        return PasswordEncoderFactories.createDelegatingPasswordEncoder()
    }
}