package com.chinasoft.goldenidea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * for hc
 * @author Mango
 *
 */
@Controller
public class IndexController {

	/**
	 * for hc
	 * @return It works
	 */
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "It works";
    }

}
