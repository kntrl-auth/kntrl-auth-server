package kntrl.example.pluginserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
@EnableWebMvc
public class Config implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RequireQueryKeyInterceptor()).addPathPatterns("/my/api/auth-plugins/**");
    }

    static class RequireQueryKeyInterceptor implements HandlerInterceptor {
        private static final String key = "34VxHAWeDhY4Ir4H2RaNcMpUwLt7OF";

        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            if (key.equals(request.getParameter("key"))) {
                return true;
            } else {
                response.setStatus(403);
                response.getWriter().write("Access denied");
                response.getWriter().flush();
                return false;
            }
        }
    }
}
