package me.will;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Servlet Listener
 * - 웹 애플리케이션에서 발생하는 주요 이벤트를 감지하고, 각 이벤트에 특별한 작업이 필요한 경우에 사용 가능
 * 1. 서블넷 컨텍스트 수준의 이벤트
 * - 컨텍스트 라이프 사이클 이벤트
 * - 컨텍스트 애트리뷰트 변경 이벤트
 *
 * 2. 세션 수준의 이벤트
 * - 세션 라이프사이클 이벤트
 * - 세션 애트리뷰트 변경 이벤트
 */
public class MyListener implements ServletContextListener { // 1. 서블릿 컨테이너의 라이프 사이클

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context Initialized");
		sce.getServletContext().setAttribute("name", "will");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Context Destroyed");
	}

}
