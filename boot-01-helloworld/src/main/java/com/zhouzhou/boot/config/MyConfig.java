package com.zhouzhou.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.zhouzhou.boot.bean.Pet;
import com.zhouzhou.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 周万宁
 * @className MyConfig
 * @create 2023/1/4-1:49
 * @description
 */

/**
 * 1.配置类里面使用@Bean标注再方法上给容器注册组件,默认也是单示例的
 * 2.配置类本身也是组件
 * 3.proxyBeanMethod: 代理bean的方法
 *      Full(proxyBeanMethods = true)全配置,Lite轻量配置(proxyBeanMethods = false)
 *
 *      full:类组件之间有依赖甚,方法会被调用得到之前但单示例组件,用full模式
 *      lite:类组件中无依赖关系用lite模式加速容器的启动过程,减少判断
 *  4.@Import({User.class, DBHelper.class})
 *  会给容器中自动创建出这两个类型的组件,默认组件的名字就是全类名
 *  5.@conditional条件装配,当条件成立的时候才加载组件,当条件不成立的时候不会加载组件
 *
 */
//@ConditionalOnBean(name = "tom")
//@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = true)//告诉springboot这是一个配置类 == 配置文件
public class MyConfig {

    /**
     *
     * 外部无论对配置类中这个组件注册方法调用多少次获取的都是之气那注册容器中的单实例对象
     *
     * @return
     */
    @ConditionalOnBean(name = "tom")
    @Bean //给容器中添加组件,以方法名作为组件的id,返回类型就是组件类型,返回的值就是组件再容器中的示例
    public User user01(){
        User user = new User("张三");
        user.setPet(tomcatPet());
        return user;
    }

    @Bean("tom")
    public Pet tomcatPet(){
        return new Pet();
    }


}
