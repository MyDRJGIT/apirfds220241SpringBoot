package com.codideep.app;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.mariadb.jdbc.MariaDbPoolDataSource;

@Configuration
public class MariaDbConfig {
	@Bean
	DataSource dataSource() {
		MariaDbPoolDataSource dataSource = new MariaDbPoolDataSource();

		try {
			dataSource.setUrl("jdbc:mariadb://localhost:3306/dbgeneral");
			dataSource.setUser("root");
			dataSource.setPassword("030191");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dataSource;
	}
}