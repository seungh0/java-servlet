package me.will;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Servlet Filter
 * - 들어온 요청을 서블릿으로 보내고, 또 서블릿이 작성한 응답을 클라이언트로 보내기 전에 특별한 처리가 필요한 경우 사용 가능.
 * - 체인 형태의 구조.
 */
public class MyFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filter Init");
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		System.out.println("Filter");
		filterChain.doFilter(servletRequest, servletResponse); // 다음 필터로의 연결을 위한 체인 연결 (체이닝)
	}

	@Override
	public void destroy() {
		System.out.println("Filter Destroy");
	}

}
