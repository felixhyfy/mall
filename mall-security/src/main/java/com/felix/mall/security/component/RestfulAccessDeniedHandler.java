package com.felix.mall.security.component;

import cn.hutool.json.JSONUtil;
import com.felix.mall.response.CommonResponse;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Felix
 * @packageName com.felix.mall.security.component
 * @className RestfulAccessDeniedHandler
 * @description 当访问接口没有权限时，自定义的返回结果
 * @date 2021/1/10 13:41
 */
@Component
public class RestfulAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request,
                       HttpServletResponse response,
                       AccessDeniedException e) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        //将异常信息写入
        response.getWriter().println(JSONUtil.parse(CommonResponse.forbidden(e.getMessage())));
        //刷新
        response.getWriter().flush();
    }
}
