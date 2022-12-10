package com.test.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration 
{
	//@Override
	protected void configure(HttpSecurity http) throws Exception {

		  http .authorizeRequests()
		  		.anyRequest().authenticated()
				  // httpBasic authentication
		  		.and() .httpBasic();
	}
}