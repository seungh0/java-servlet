package me.will;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * DispatcherServlet - Root WebApplicationContext
 * (containing services, repositories ...)
 *
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc
 */
@Configuration
@ComponentScan(useDefaultFilters = false, includeFilters = @ComponentScan.Filter(Controller.class))
public class WebConfig {
}
