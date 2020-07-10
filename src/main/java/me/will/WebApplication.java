package me.will;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * - DispatcherServlet 초기화
 * 특정 타입의 해당하는 빈을 찾는다.
 * 없으면 기본 전략 사용(DispatcherServlet.properties)
 *
 * - 스프링 부트를 사용하지 않는 Spring MVC
 * 서블릿 컨테이너 안에 등록한 웹 애플리케이션에 DispatcherServlet 을 등록한다.
 * 1. web.xml에 서블릿 등록
 * 2. 또는 WebApplicationInitializer에 자바 코드로 서블릿 등록
 *
 * - 스프링 부트로 사용하는 Spring MVC
 * 자바 애플리케이션에 내장 Tomcat 을 만들고, 그 안에 DispatcherServlet을 등록한다. (스프링 부트 자동 설정이 자동으로 해줌)
 * 스프링 부트의 주관에 따라 여러 인터페이스 구현체를 빈으로 등록한다.
 */

// web.xml 로 등록하는 방법과 대응되는 자바 코드로 서블릿 등록 하는 방법
public class WebApplication implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// WebConfig 설정 기반의 Application Context 등록
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.setServletContext(servletContext);
		context.register(WebConfig.class);
		context.refresh();

		// Application Context 에 DispatcherServlet 등록
		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic app = servletContext.addServlet("app", dispatcherServlet);
		app.addMapping("/app/*");
	}

}
