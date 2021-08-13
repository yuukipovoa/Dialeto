package app.web.dialeto.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import app.web.dialeto.acesso.Usuario;

/**
 * @author José Victor Santos V
 *
 */
@Controller
public class LoginController {

	@GetMapping("/login")
	public String exibirLogin(Usuario usuario) {
		return "login";
	}

	@PostMapping("/login")
	public String efetuarLogin(Usuario usuario, HttpSession session) {
		if (usuario.getEmail().equals("vieira@teste.com") && usuario.getSenha().equals("cuscuz")) {
			
			usuario.setNome("Geremias Vieira");
			
			// Guardar sessão o objeto usuario, ainda não terminado!
			session.setAttribute("usuarioLogado", usuario);
			System.out.println("if - Cheguei aqui!");
			return "redirect:/registroAluno";
		} else {
			System.out.println("Else - Cheguei aqui!");
			return "redirect:/";
		}
	}
}
