package app.web.dialeto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import app.web.dialeto.model.RegistroProfessorModel;
import app.web.dialeto.repository.RegistroProfessorRepository;

/**
 * @author José Victor Vieira
 *
 */
@Controller
public class RegistroProfessorController {

	private List<RegistroProfessorModel> registroProfessor = new ArrayList<>();
	@Autowired
	private RegistroProfessorRepository registroProfessorRepository;
	
	@GetMapping("/registroProf")
	public String registroProfessor(@ModelAttribute RegistroProfessorModel registroProfessorModel)	{
		return "registroProf";
	}

	@PostMapping("/registrarProfessor")
	public String registrarProfessor(RegistroProfessorModel registroProfessorModel) {
		this.registroProfessorRepository.save(registroProfessorModel);
		return "redirect:/login";
	}

}