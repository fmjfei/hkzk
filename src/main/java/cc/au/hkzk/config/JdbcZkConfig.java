package cc.au.hkzk.config;

import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "cc.au.hkzk.mapper.zk", sqlSessionTemplateRef = "sqlSessionTemplateZk")
public class JdbcZkConfig {

    @Bean(name = "zkds")
    @ConfigurationProperties(prefix = "spring.datasource.zk")
    @Primary //设置主数据源
    public DataSource dataSource(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        return hikariDataSource;
    }

}
