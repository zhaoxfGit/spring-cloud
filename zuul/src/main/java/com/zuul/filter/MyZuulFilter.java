package com.zuul.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * @Description: 自定义过滤器 实现动态路由配置
 * @author: zhaoxuefeng
 * @date: 2018年7月23日 下午2:19:46
 */
public class MyZuulFilter extends ZuulFilter {
	
	private static Logger log = LoggerFactory.getLogger(MyZuulFilter.class);

	/**
    * 过滤器的具体逻辑
    *  ctx.setSendZuulResponse(false)令zuul不允许请求，
    *  ctx.setResponseStatusCode(401)设置了其返回的错误码
    *  ctx.setResponseBody(body)编辑返回body内容
    * @return
    */
   @Override
   public Object run() {
       RequestContext ctx = RequestContext.getCurrentContext();
       HttpServletRequest request = ctx.getRequest();
       log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
       Object accessToken = request.getParameter("id");
       if(accessToken == null) {
           log.warn("id is null");
           ctx.setSendZuulResponse(false);
           ctx.setResponseStatusCode(401); // 先登录
           return null;
       }

       log.info("pass!");
       return null;
   }

	/**
     * 判断过滤器是否执行
     */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/**
     * 通过int值来定义过滤器的执行顺序
     */
	@Override
	public int filterOrder() {
		return 0;
	}

	/**
     * 返回过滤器类型
     * @return
     *  pre：可以在请求被路由之前调用
     *  routing：在路由请求时候被调用
     *  post：在routing和error过滤器之后被调用
     *  error：处理请求时发生错误时被调用
     */
	@Override
	public String filterType() {
		return "pre";
	}

}
