//hello world!
package com.eventoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	//quando receber a requisição http contendo a "/", exibe a view que está criada em resources->templates. 
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
