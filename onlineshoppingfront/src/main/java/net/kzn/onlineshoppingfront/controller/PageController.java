package net.kzn.onlineshoppingfront.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.onlineshoppingfront.Product;
import net.kzn.onlineshoppingfront.hello;

@Controller
public class PageController {
@Autowired	
Product prd;
@Autowired
hello hel;
@RequestMapping(value= {"/","/home","/index"})
public ModelAndView index() throws IOException
{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("greeting","Welcome to spring web mvc"+prd.getProducts("hello"));
	return mv;
}

/*
@RequestMapping(value="/test")
public ModelAndView hello(@RequestParam(value="greeting")String greeting)
{
	if(greeting==null)
	{
		greeting="NO VALUE ENTERED.PLEASE CHANGE THE VALUE OF greeting IN THE ABOVE TAB";
	}
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("greeting",greeting);
	return mv;	
}

*/


@RequestMapping(value="test/{greeting}")
public ModelAndView hello(@PathVariable(value="greeting",required=false)String greeting)
{
	if(greeting==null)
	{
		greeting="NO VALUE ENTERED.PLEASE CHANGE THE VALUE OF greeting IN THE ABOVE TAB";
	}
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("greeting",greeting);
	return mv;	
}
}