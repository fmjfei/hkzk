package cc.au.hkzk.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public DataSource dataSource(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        return hikariDataSource;
    }
/*    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hk")
    public DataSource hk(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        return hikariDataSource;
    }*/
}
