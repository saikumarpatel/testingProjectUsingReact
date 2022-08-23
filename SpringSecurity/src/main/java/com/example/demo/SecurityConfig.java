package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	 http.cors();
//    	http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic().and()
//            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).cors();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("patel").password(getPasswordEncode().encode("aaaAAA123"))
             .roles("USER").and().withUser("admin")
            .password(getPasswordEncode().encode("aaaAAA123")).credentialsExpired(true).accountExpired(true).accountLocked(true)
            .authorities("WRITE_PRIVILEGES", "READ_PRIVILEGES").roles("ADMIN");
    }
    @Bean
    public BCryptPasswordEncoder getPasswordEncode() {
        return new BCryptPasswordEncoder();
    }

}