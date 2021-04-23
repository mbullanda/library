package pl.michal.excersiseTwo.library;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class BookMockDataInitializer {

    private final BookService bookService;

    @PostConstruct
    public void initializeData(){

    }
}
