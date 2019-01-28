package challenge;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Integer> {

    Quote findQuoteById(Integer id);

    List<Quote> findQuoteByActorContains(String actor);

}
