package com.kashit;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import process.Processor;
 
public class HelloWorldController extends AbstractController {
	private Processor processor;
   	@Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception{
    	String processedNameValue=processor.processName(request.getParameter("textName"));
   		//String processedNameValue="<html><head><meta charset='ISO-8859-1'><title>This is my Title</title></head><body>This is index page</body></html>";
   		
    	return new ModelAndView("result","processedNameKey", processedNameValue);
    }
	public void setProcessor(Processor processor) {
			this.processor = processor;
	}
}