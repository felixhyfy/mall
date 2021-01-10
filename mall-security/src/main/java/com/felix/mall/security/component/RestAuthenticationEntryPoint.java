package com.felix.mall.security.component;

import cn.hutool.json.JSONUtil;
import com.felix.mall.response.CommonResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Felix
 * @packageName com.felix.mall.security.component
 * @className RestAuthenticationEntryPoint
 * @description 当未登录或者token失效访问接口时，自定义的JSON返回结果
 * @date 2021/1/10 13:58
 */
@Component
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException e) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        //将异常信息写入
        response.getWriter().println(JSONUtil.parse(CommonResponse.unauthorized(e.getMessage())));
        response.getWriter().flush();
    }
}
