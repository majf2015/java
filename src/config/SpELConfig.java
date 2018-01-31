package config;

import com.sdcm.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;


/**
 * Created by Administrator on 2017/12/29.
 */

//通过自动扫描组件注入
@Configuration
@EnableAspectJAutoProxy
//@ComponentScan(basePackages = {"com.sdcm"})
@PropertySource("classpath:/rules/run.properties")
public class SpELConfig {

    @Autowired
    Environment environment;

    //显示配置
    @Bean
    public SpEL spEL() {
        return new SpELImp(environment.getProperty("run.string"));
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public  Aop aopImp(){
        return new AopImp();
    }
}

//通过显示配置bean注入

