package com.hongmeng.is.common.tld;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;


public class HmTags extends TagSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3073546063519453138L;

	private String url ;
	public void setUrl(String url) {
		this.url = url ;
	}

	public static String url(String s) {
		return s ;
	}
	
	public int doStartTag() throws JspException {
		
		try {
			ServletRequest request = this.pageContext.getRequest() ;
			
			this.pageContext.getOut().write(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return super.doStartTag() ;
	}
}
