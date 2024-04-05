package com.example.baseentity.resolver;

import jakarta.servlet.http.HttpServletRequest;
import lombok.Getter;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.util.stream.Collectors;

@Getter
public class IDArgumentResolverResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return IDResolver.class.isAssignableFrom(parameter.getParameterType());
    }

    @Override
    public Object resolveArgument(MethodParameter parameter,
                                  ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest,
                                  WebDataBinderFactory binderFactory) throws Exception {

        if (parameter.getParameterType().equals(IDResolver.class)) {
            HttpServletRequest httpServletRequest = (HttpServletRequest) webRequest.getNativeRequest();
            if (httpServletRequest != null && MediaType.APPLICATION_JSON_VALUE.equals(httpServletRequest.getContentType())) {
                String requestBody = httpServletRequest
                        .getReader().lines().collect(Collectors.joining(System.lineSeparator()));
                System.out.println(requestBody);
                //get all field
                return new IDResolver<>("123");
            }
        }
        return null;
    }
}
