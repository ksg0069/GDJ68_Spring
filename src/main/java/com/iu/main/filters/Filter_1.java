package com.iu.main.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iu.main.member.MemberDTO;

/**
 * Servlet Filter implementation class Filter_1
 */
public class Filter_1 implements Filter {

    /**
     * Default constructor. 
     */
    public Filter_1() {
        
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() { // 객체가 소멸될 때 하고싶은것 
		
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	

		// pass the request along the filter chain
		// 요청 발생 시 실행
		System.out.println("Filter1 Request");
		HttpSession session = ((HttpServletRequest)request).getSession();
		Object obj = session.getAttribute("member");
		if(obj != null) {
			
			chain.doFilter(request, response); // 다음필터가 있으면 가고 업으면 디스패처 서블릿
			
		}else {
			
			//foword
//			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/member/login.jsp");
//			view.forward(request, response);
			//redirect
			((HttpServletResponse)response).sendRedirect("../member/login");
			
			
		}
		
		
		System.out.println("Filter1 Response");
		//응답 발생시 실행
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
