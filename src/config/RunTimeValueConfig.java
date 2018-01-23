package config;

import com.sdcm.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;


/**
 * Created by Administrator on 2017/12/29.
 */

//通过自动扫描组件注入
@Configuration
//@ComponentScan(basePackages = {"com.sdcm"})
@PropertySource("classpath:/rules/run.properties")
public class RunTimeValueConfig {

    @Autowired
    Environment environment;

    //显示配置
    @Bean
    public RunTimeValue runTimeValue() {
        return new RunTimeValueImp(environment.getProperty("run.string"));
    }

    @Bean
    public RunTimeValue runTimeImp() {
        return new RunTimeImp(environment.getProperty("run.string"));
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}

//通过显示配置bean注入

