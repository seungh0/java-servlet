package me.will;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * DispatcherServlet - Root WebApplicationContext
 * (containing services, repositories ...)
 *
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc
 */
@Configuration
@ComponentScan
public class WebConfig {

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

}
