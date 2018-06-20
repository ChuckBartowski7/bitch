package com.boraji.tutorial.springboot.security;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableAutoConfiguration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	
	

	@Autowired
	DataSource dataSource;
 
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery("select username,password, enabled from utente where username=?")
				.authoritiesByUsernameQuery("select username, ruolo from ruolo where username=?");
	}
	
	
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/resources/**", "/js/**", "/images/**").permitAll();
		
		http.authorizeRequests().antMatchers("/admingestion").hasAuthority("ADMIN");
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/", "/home", "/teams", "/indexx", "/evkids", "/evnature", "/evanim")
				.permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll().and()

				.logout().permitAll();

	}

	/*
     @Autowired public void configureGlobal(AuthenticationManagerBuilder auth)
	  throws Exception { auth .inMemoryAuthentication()
	  .withUser("admin").password("admin").roles("ADMIN")
	  .and().withUser("user").password("user").roles("USER");
	  } */
	  
	 

}
