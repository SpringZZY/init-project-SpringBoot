package com.data.main.dataSource;

import javax.annotation.Resource;
import javax.persistence.EntityManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ConditionalOnClass({ EnableTransactionManagement.class, EntityManager.class })
public class MybatisConfiguration implements EnvironmentAware {

    private static Log logger = LogFactory.getLog(MybatisConfiguration.class);

    private RelaxedPropertyResolver propertyResolver;

    @Resource(name = "MasterDataSource")
    private dataConfiguration dtConfiguration;

    @Override
    public void setEnvironment(Environment environment) {
        this.propertyResolver = new RelaxedPropertyResolver(environment, "spring.datasource.");
    }

    @Bean
    @ConditionalOnMissingBean
    public SqlSessionFactory sqlSessionFactory() {
        try {
            SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
            // sessionFactory.setDataSource(roundRobinDataSouceProxy()); 对应下面注释代码
            sessionFactory.setDataSource(dtConfiguration.MasterDataSource());
            sessionFactory.setTypeAliasesPackage(propertyResolver
                    .getProperty("typeAliasesPackage"));
            sessionFactory
                    .setMapperLocations(new PathMatchingResourcePatternResolver()
                            .getResources(propertyResolver
                                    .getProperty("mapperLocations")));
            sessionFactory
                    .setConfigLocation(new DefaultResourceLoader()
                            .getResource(propertyResolver
                                    .getProperty("configLocation")));

            return sessionFactory.getObject();
        } catch (Exception e) {
            logger.warn("Could not confiure mybatis session factory");
            return null;
        }
    }

    /*
     * @Bean 注释代码 为读写分离的数据源配置，不同的数据对应的动作是不同的。 把数据源注入到 该代理中 再把该代理设置到 SqlSessionFactory 中 public
     * RoundRobinRWRoutingDataSourceProxy roundRobinDataSouceProxy(){ RoundRobinRWRoutingDataSourceProxy proxy = new
     * RoundRobinRWRoutingDataSourceProxy(); proxy.setWriteDataSource(writeDataSource);
     * proxy.setReadDataSoures(readDataSources); proxy.setReadKey("READ"); proxy.setWriteKey("WRITE");
     * 
     * return proxy; }
     */

    @Bean
    @ConditionalOnMissingBean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dtConfiguration.MasterDataSource());
    }

}
