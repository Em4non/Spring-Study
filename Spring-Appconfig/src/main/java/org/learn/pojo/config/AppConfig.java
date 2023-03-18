package org.learn.pojo.config;

import org.learn.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * IntelliJ IDEA
 *
 * @author Em4non E-mail:kaifenglin@126.com
 * @project_name Spring-Study
 * @package org.learn.pojo.config
 * @className AppConfig
 * @date 2023/3/14 08:29
 */
@Configuration
@Import(AppConfig2.class)
@ComponentScan("org.learn")
public class AppConfig {

    @Bean
    public User user(){
        return new User();
    }

}
