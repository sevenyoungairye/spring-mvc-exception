package cn.bitqian.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义异常类
 * @author echo lovely
 * @date 2020/9/8 10:21
 */
public class MyExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        // 根据异常 e 做去对应的业务操作
        if (e instanceof MyException) {
            // do sth...
        } else if (e instanceof NumberFormatException) {
            // do sth...
            modelAndView.addObject("msg", "NumberFormatException..");
        }

        modelAndView.setViewName("error");

        return modelAndView;
    }
    // 继承 exception handler exception resolver

}
