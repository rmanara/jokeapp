package guru.springframework.jokeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.jokeapp.services.JokesService;

@Controller
public class JokesController {
	
	private JokesService jokesService;

	public JokesController(JokesService jokesService) {
		this.jokesService = jokesService;
	}

	@RequestMapping({"/",""})
	public String getJoke(Model model) {
		String joke = jokesService.getRandomChuckNorrisQuote();
		model.addAttribute("joke", joke);
		return "chucknorris";
	}
}
