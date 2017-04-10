package com.tiy.hackathon.ApiControllers;

import com.tiy.hackathon.controller.PhraseRepository;
import com.tiy.hackathon.model.PhraseCharacter;
import com.tiy.hackathon.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by josh on 4/8/17.
 */
@RestController
public class ValidatorApi {
	@Autowired
	PhraseRepository repository;

	@Autowired
	GameService gameService;


	//@RequestMapping(method = RequestMethod.POST, headers = {"Accept=application/json"},value = "/check-letter")
	@PostMapping("/check-letter")
	@ResponseStatus(HttpStatus.OK)
	public String checkLetterInPhrase(@RequestParam("phraseID") String phraseID, @RequestParam("phraseChar") String letter){
		System.out.println(phraseID+" "+ letter);
		char guess = letter.toUpperCase().charAt(0);
		Integer id = Integer.parseInt(phraseID);
		boolean isInPhrase = gameService.isInPhrase(guess,repository.getPhraseByID(id).get(0));
		System.out.println(isInPhrase);
		return String.format("{\"isInPhrase\": %s, \"isGameOver\":%s}",isInPhrase,gameService.isGameOver());
	}

}