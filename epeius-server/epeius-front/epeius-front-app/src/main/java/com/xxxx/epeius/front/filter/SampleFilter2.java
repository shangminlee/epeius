package com.xxxx.epeius.front.filter;


import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * Description: 示例过滤器2
 * Author: lishangmin
 * Created: 2019-04-17 15:17
 */
@Slf4j
public class SampleFilter2 implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("filter 2 init");
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		log.info("filter 2 do");
		filterChain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void destroy() {
		log.info("filter 2 destory");
	}
}
