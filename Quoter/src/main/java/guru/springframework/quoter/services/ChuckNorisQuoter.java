package guru.springframework.quoter.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorisQuoter implements Quoter {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorisQuoter() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String sayRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
