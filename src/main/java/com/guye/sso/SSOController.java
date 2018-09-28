package com.guye.sso;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by suneee on 2018/8/21.
 */
@Controller
public class SSOController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloPage(){
        return "Springboot集成SSO";
    }
}
