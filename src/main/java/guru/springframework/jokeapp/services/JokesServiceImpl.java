package guru.springframework.jokeapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServiceImpl implements JokesService {
	
	private ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

	@Override
	public String getRandomChuckNorrisQuote() {
		return quotes.getRandomQuote();
	}

}
