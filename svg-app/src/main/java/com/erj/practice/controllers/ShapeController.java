package com.erj.practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.erj.practice.domain.Shape;

@Controller
public class ShapeController {

	@RequestMapping("/shape")
	public ModelAndView home(@RequestParam int numberOfSides) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("shape");
		
		Shape pentagon = new Shape();
		pentagon.setNumberOfSides(numberOfSides);
		pentagon.setSideLength(1);
		
		mav.addObject("area", pentagon.getArea());
		mav.addObject("perimeter", pentagon.getPerimeter());
		mav.addObject("numberOfSides", pentagon.getNumberOfSides());
		mav.addObject("points", pentagon.getPoints());
		
		return mav;
	}
}
