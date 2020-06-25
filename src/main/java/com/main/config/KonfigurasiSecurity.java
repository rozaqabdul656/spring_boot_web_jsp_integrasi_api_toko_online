package com.main.config;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class KonfigurasiSecurity extends WebSecurityConfigurerAdapter{

	@Autowired
	DataSource dataSource;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication().dataSource(dataSource)
			.usersByUsernameQuery("select ussername,password,enabled from tb_admin where ussername=?")
			.authoritiesByUsernameQuery("select ussername, role from user_roles where ussername=?");
	}	
///konfigurasi web mana yg boleh diakses admin staf user dll
protected void configure(HttpSecurity http) throws Exception{

	http.authorizeRequests()
		.antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
		.and()
         .authorizeRequests()
         .antMatchers("*/css/**","*/js/**","*/img/**","*/png/**").permitAll()
         .anyRequest().authenticated()
         .and()
         .formLogin()
         .loginPage("/login")
         .usernameParameter("username").passwordParameter("password")
         .defaultSuccessUrl("/admin/dashboard")
         .permitAll()
         .and()
         .logout()
         .and()
         .csrf();
//         .addFilterAfter(new CsrfAttributeToCookieFilter(), CsrfFilter.class)
//         .csrf().csrfTokenRepository(csrfTokenRepository());
}
//
//private CsrfTokenRepository csrfTokenRepository() {
//	HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
//	repository.setHeaderName("X-XSRF-TOKEN");
//	return repository;
//	}
}