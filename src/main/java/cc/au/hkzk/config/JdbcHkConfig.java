package cc.au.hkzk.config;

import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "cc.au.hkzk.mapper.hk", sqlSessionTemplateRef = "sqlSessionTemplateHk")
public class JdbcHkConfig {

    @Bean(name = "hkds")
    @ConfigurationProperties(prefix = "spring.datasource.hk")
    @Primary //设置主数据源
    public DataSource dataSource(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        return hikariDataSource;
    }

}