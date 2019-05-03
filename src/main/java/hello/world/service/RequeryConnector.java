package hello.world.service;

import java.beans.PropertyVetoException;

import javax.inject.Singleton;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import hello.world.model.Models;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.requery.Persistable;
import io.requery.meta.EntityModel;
import io.requery.sql.Configuration;
import io.requery.sql.ConfigurationBuilder;
import io.requery.sql.EntityDataStore;


@Factory
public class RequeryConnector {
	EntityDataStore<Persistable> dao;

	public RequeryConnector(DbConfig config) throws PropertyVetoException {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setJdbcUrl(config.url);
        cpds.setUser(config.username);
        cpds.setPassword(config.password);        
	    init(cpds, Models.DEFAULT);
	}
	
    @Bean
    @Singleton
	public EntityDataStore<Persistable> getDAO() {
		return dao;
	}
	
    private void init(DataSource dataSource, EntityModel model) {
        Configuration configuration = new ConfigurationBuilder(dataSource, model)
                .build();
        dao = new EntityDataStore<>(configuration);
    }
}