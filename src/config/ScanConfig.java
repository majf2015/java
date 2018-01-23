package config;

import com.sdcm.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


/**
 * Created by Administrator on 2017/12/29.
 */

//通过自动扫描组件注入
@Configuration

@ComponentScan(basePackages = {"com.sdcm"})
//java的config文件导入XML配置
@ImportResource("classpath*:rules/spring_prj.xml")
public class ScanConfig {
//    //显示配置
    @Bean
    public CalculatorInterface calculatorInterfaceImp() {
        return new CalculatorInterfaceImp();
    }
//
//    @Bean(name = "anotherAddInterfaceImp")
//    public AddInterface anotherAddInterface() {
//        return new AnotherAddInterfaceImp();
//    }
//
//    //声明一个引用其他bean的才能生效的bean
//    @Bean
//    //方案一：生成自身bean时直接调用已生成的引用类CalculatorInterfaceImp的bean
////    public  SubtractInterfaceImp subtractInterface() {
////        return  new SubtractInterfaceImp(calculatorInterfaceImp());
////    }
//    //方案二：生成自身bean时调用通过参数声明引用类传入的bean
////    public  SubtractInterfaceImp subtractInterface(CalculatorInterface calculator) {
////        return  new SubtractInterfaceImp(--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------);
////    }
//    //方案三：通过setter方法注入其他类的bean
//    public SubtractInterfaceImp subtractInterfaceImp(CalculatorInterface calculator) {
//        SubtractInterfaceImp subtract = new SubtractInterfaceImp();
//        subtract.setSub(calculator);
//        return subtract;
//    }

}

//通过显示配置bean注入

