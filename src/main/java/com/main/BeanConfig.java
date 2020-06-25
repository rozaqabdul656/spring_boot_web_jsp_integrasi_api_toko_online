package com.main;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
@Configuration
public class BeanConfig {

	@Bean
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
	
}
