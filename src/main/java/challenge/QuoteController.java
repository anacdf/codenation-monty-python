package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//codenation test -c java-5
//codenation submit -c java-5

@RestController
@RequestMapping(value = "/v1")
public class QuoteController {

	@Autowired
	private QuoteService quoteService;

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
	public Quote getQuote() {
		return quoteService.getQuote();
	}

	@GetMapping@RequestMapping(value = "/quote/{actor}", method = RequestMethod.GET)
	public Quote getQuoteByActor(@PathVariable String actor) {
		return quoteService.getQuoteByActor(actor);
	}

}
