package config;

import com.intellij.util.xml.Scope;
import com.sdcm.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



/**
 * Created by Administrator on 2017/12/29.
 */

//通过自动扫描组件注入
@Configuration
//@ComponentScan(basePackages = {"com.sdcm"})
public class ScopeConfig {
    //显示配置
    @Bean
    //编译不通过
    //@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public ScopeSingleton singleton() {
        return new ScopeSingletonImp();
    }

    @Bean
    //编译不通过
    //@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ScopePrototype scopePrototype() {
        return new ScopePrototypeImp();
    }

    @Bean
    public ScopeSession scopeSession() {
        return new ScopeSessionImp();
    }
}

//通过显示配置bean注入

