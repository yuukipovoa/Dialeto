package app.web.dialeto.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author José Victor Santos V
 *
 */
@RestController
@Controller
public class DialetoController {
	
	ModelAndView modelAndView = new ModelAndView();

	@RequestMapping("/")
	public ModelAndView index() {
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
	modelAndView.setViewName("login");
	return modelAndView;
	}
	
	@RequestMapping("/escCadastro")
	public ModelAndView escCadastro() {
		modelAndView.setViewName("escCadastro");
		return modelAndView;
	}
	
	@RequestMapping("/registroAluno")
	public ModelAndView registroAluno() {
		modelAndView.setViewName("registroAluno");
		return modelAndView;
	} 
	
	
	
	@RequestMapping("/registroProf")
	public ModelAndView registroProf() {
		modelAndView.setViewName("registroProf");
		return modelAndView;
	}
	
	@RequestMapping("/conteudo")
	public ModelAndView conteudo() {
		modelAndView.setViewName("conteudo");
		return modelAndView;
	}
	
	@RequestMapping("/areaProf")
	public ModelAndView areaProf() {
		modelAndView.setViewName("areaProf");
		return modelAndView;
	}
	
	} 
