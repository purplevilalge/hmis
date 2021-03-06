package com.hongmeng.is.controllers.admin;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hongmeng.is.common.bo.TXm;
import com.hongmeng.is.services.XmService;

@Controller
@RequestMapping("/admin/projects")
public class ProjectController {
	private static final Logger logger = LoggerFactory
			.getLogger(ProjectController.class);

	static final private String prefixViewTplPath = "admin/";
	
	@Autowired
	private XmService xmService ;

	@RequestMapping(method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		
		model.addAttribute("allXm", this.xmService.findAll()) ;
		
		model.addAttribute("pageTitle", "广州鸿蒙信息科技有限公司 - 项目管理系统") ;
		model.addAttribute("contentPage", "./projects/index.jsp") ;

		return prefixViewTplPath + "index";
	}
	
	@RequestMapping("/{xmId}")
	public String view(@PathVariable("xmId") Integer xmId, Locale locale, Model model) {
		
		TXm xm = this.xmService.findById(xmId) ;
		model.addAttribute("xm", xm) ;
				
		model.addAttribute("pageTitle", "广州鸿蒙信息科技有限公司 - 项目管理系统") ;
		model.addAttribute("contentPage", "./projects/view.jsp") ;

		return prefixViewTplPath + "index";
	}

	@RequestMapping("/{xmId}/edit")
	public String edit(@PathVariable("xmId") Integer xmId, Locale locale, Model model) {
		
		model.addAttribute("xm", this.xmService.findById(xmId)) ;
		
		model.addAttribute("pageTitle", "广州鸿蒙信息科技有限公司 - 项目管理系统") ;
		model.addAttribute("contentPage", "./projects/edit.jsp") ;

		return prefixViewTplPath + "index";
	}

}
