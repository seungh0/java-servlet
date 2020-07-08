package me.will;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * DispatcherServlet - Root WebApplicationContext
 * (containing services, repositories ...)
 *
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc
 */
@Configuration
@ComponentScan
public class WebConfig {
}
