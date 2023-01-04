package com.zhouzhou.admin.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 周万宁
 * @className LoginInterceptor
 * @create 2023/1/5-4:38
 * @description
 *
 * 登录检查
 * 1.配置好拦截去要拦截哪些请求
 * 2.把这些配置放在容器中
 */
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * @MethodName preHandle
     * @Author 周万宁
     * @Description 目标方法执行之前
     * @Date 4:38 2023/1/5
     * @Param [request, response, handler]
     * @return boolean
     **/


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        Object user = session.getAttribute("loginUser");
        if(user != null){
            return true;
        }
        //拦截住未登录,跳转到登录页面
        session.setAttribute("msg","请先登录");
//        response.sendRedirect("/");
        request.getRequestDispatcher("/").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
