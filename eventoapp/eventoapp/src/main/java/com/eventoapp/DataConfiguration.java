package com.eventoapp;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataConfiguration {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName ("com.mysql.jdbc.Driver");
			dataSource.setUrl ("jdbc:mysql://localhost:3306/eventosapp");
			dataSource.setUsername("root");
			dataSource.setPassword("maira");
			return dataSource;
		}	
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);
		adapter.setShowSql(true); //mostra o passo a passo da criação de tabelas, etc no console
		adapter.setGenerateDdl(true); //permite que o hibernate crie as tabelas automaticamente
		adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
		adapter.setPrepareConnection(true); //pra que o hibernate prepare a conexão automaticamente
		return adapter; //isso é um objeto!
	}	
}