package com.xxxx.epeius.front.filter;


import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * Description: 示例过滤器
 * Author: lishangmin
 * Created: 2019-04-17 15:13
 */
@Component
@Slf4j
@Order(Integer.MIN_VALUE)
public class SampleFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("filter 1 init");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		log.info("filter 1 do");
		chain.doFilter(request,response);
	}

	@Override
	public void destroy() {
		log.info("filter 1 destory");
	}

}
