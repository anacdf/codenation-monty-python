package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository quoteRepository;

    private Random random = new Random();
    private Integer id;

    @Override
	public Quote getQuote() {
        id = random.nextInt(18342);
		return quoteRepository.findQuoteById(id);
	}

	@Override
	public Quote getQuoteByActor(String actor) {
		return quoteRepository.findQuoteByActorContains(actor).stream().findAny().get();
	}
}
