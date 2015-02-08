package com.hongmeng.is.controllers.admin;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class IndexController {
	private static final Logger logger = LoggerFactory
			.getLogger(IndexController.class);

	static final private String prefixTplPath = "admin/";

	@RequestMapping(method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		
		model.addAttribute("vvv", "this is a test value passed by controller.") ;

		return prefixTplPath + "index";
	}

}
