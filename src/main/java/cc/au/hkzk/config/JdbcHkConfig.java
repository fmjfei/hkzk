package cc.au.hkzk.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "cc.au.hkzk.mapper.hk", sqlSessionTemplateRef = "sqlSessionTemplateHk")
public class JdbcHkConfig {

    @Bean(name = "hkds")
    @ConfigurationProperties(prefix = "spring.datasource.hk")
    public DataSource dataSource(){
/*        HikariDataSource hikariDataSource = new HikariDataSource();
        return hikariDataSource;*/
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }

    @Bean(name = "sqlSessionFactoryHk")
    public SqlSessionFactory sqlSessionFactoryOne(@Qualifier("hkds") DataSource dataSource)throws Exception{
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean(name = "dataSourceTransactionManagerHk")
    public DataSourceTransactionManager dataSourceTransactionManagerOne(@Qualifier("hkds") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "sqlSessionTemplateHk")
    public SqlSessionTemplate sqlSessionTemplateOne(@Qualifier("sqlSessionFactoryHk") SqlSessionFactory sqlSessionFactory)throws Exception{
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}