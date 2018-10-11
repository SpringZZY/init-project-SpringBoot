package com.data.main.dataSource;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@EnableTransactionManagement
@ConfigurationProperties(prefix = "classpath:/config/data_source_application.properties")
public class dataConfiguration implements EnvironmentAware {

    private RelaxedPropertyResolver propertyResolver;

    private static Logger log = LoggerFactory.getLogger(dataConfiguration.class);

    @Override
    public void setEnvironment(Environment environment) {

        this.propertyResolver = new RelaxedPropertyResolver(environment, "spring.datasource.");
    }

    /***
     * 主数据源 加上@Primary 标签就代表该数据源是默认数据源。
     */
    @Bean(name = "MasterDataSource", destroyMethod = "close", initMethod = "init")
    @Primary
    public DataSource MasterDataSource() {
        log.info("获取数据源。。。。。。。。");
        DruidDataSource druidDataSource = new DruidDataSource();
        log.info(propertyResolver.getProperty("driverClassName"));
        log.info(propertyResolver.getProperty("url"));
        log.info(propertyResolver.getProperty("username"));
        log.info(propertyResolver.getProperty("password"));
        druidDataSource.setDriverClassName(propertyResolver.getProperty("driverClassName"));
        druidDataSource.setUrl(propertyResolver.getProperty("url"));
        druidDataSource.setUsername(propertyResolver.getProperty("username"));
        druidDataSource.setPassword(propertyResolver.getProperty("password"));
        System.out.println("123");
        return druidDataSource;
    }

    /***
     * 数据源一
     * 
     * @return
     
    @Bean(name = "", destroyMethod = "close", initMethod = "init")
    public DataSource DataSource_one() {
        return null;
    }
    */

    /***
     * 数据源二
     * 
     * @return
     
    @Bean(name = "", destroyMethod = "close", initMethod = "init")
    public DataSource DataSource_two() {
        return null;
    }
*/
    /***
     * 添加数据源到list集合中。
     * 
     * @return
     */
    public List<DataSource> listDataSource() {
        return null;
    }

}
