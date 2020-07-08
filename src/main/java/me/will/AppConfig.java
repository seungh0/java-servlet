package me.will;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * DispatcherServlet - Servlet WebApplicationContext
 * (containing controllers, view resolvers, and other web-related beans)
 *
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc
 */
@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(Controller.class))
public class AppConfig {
}
