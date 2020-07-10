package me.will;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * DispatcherServlet - Root WebApplicationContext
 * (containing services, repositories ...)
 *
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc
 */

/**
 * 스프링 MVC Components
 * 1. MultipartResolver
 * - 파일 업로드 요청 처리에 필요한 인터페이스
 * - HttpServletRequest를 MultipartHttpServletRequest로 변환해주어 요청이 담고 있는 File을 꺼낼 수 있는 API 제공
 *
 * 2. LocaleResolver
 * - 클라이언트의 위치(Locale) 정보를 파악하는 인터페이스
 * - 기본 전략은 요청 헤더의 Accpet-language를 보고 판단함. (세션, 쿠키로 파악할 수도 있음.)
 *
 * 3. ThemeResolver
 * - 애플리케이션에 설정된 테마를 파악하고, 변경할 수 있는 인터페이스
 * ex) Dark, White 테마. View를 (dark.css, white.css 적용하게끔 하는 것)
 *
 * 4. HandlerMapping
 * - 요청을 처리할 핸들러를 찾는 인터페이스
 * (RequestMappingHandlerMapping (애노테이션 기반 Handler Mapping을 찾아줌)
 * (BeanNameUrlHandlerMapping (빈 이름에 해당하는 Handler Mapping 을 찾아줌)
 *
 * 5. HandlerAdapter
 * - HandlerMapping이 찾아낸 핸들러를 처리하는 인터페이스
 * - 스프링 MVC의 확장력의 핵심
 *
 * 6. HandlerExceptionResolver
 * - 요청 처리중에  발생한 에러 처리하는 인터페이스
 *
 * 7. RequestToViewNameTranslator
 * - 핸들러에서 뷰 이름을 명시적으로 리턴하지 않은 경우, 요청을 기반으로 뷰 이름을 판단하는 인터페이스
 *
 * 8. ViewResolver
 * - 뷰 이름에 해당하는 View를 찾아내는 인터페이스
 *
 * 9. FlashMapManager
 * - FlashMap 인스턴스를 가져오고 저장하는 인터페이스
 * - FlashMap은 주로 리다이렉션을 사용할 때 요청 매개변수를 사용하지 않고 데이터를 전달하고 정리할 때 사용한다.
 *
 * org.springframework.web.servlet.DispathcerServlet 참조
 *
 * protected void initStrategies(ApplicationContext context) {
 * this.initMultipartResolver(context);
 * this.initLocaleResolver(context);
 * this.initThemeResolver(context);
 * this.initHandlerMappings(context);
 * this.initHandlerAdapters(context);
 * this.initHandlerExceptionResolvers(context);
 * this.initRequestToViewNameTranslator(context);
 * this.initViewResolvers(context);
 * this.initFlashMapManager(context);
 * }
 */

@Configuration
@ComponentScan
@EnableWebMvc
public class WebConfig {

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

}
