package com.venafan.generator.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yanghang
 * @version V1.0
 * Created in 2020-05-01 10:26
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/admin/**" )
                .addResourceLocations("classpath:/static/*" );
//        super.addResourceHandlers(registry);
    }

}
