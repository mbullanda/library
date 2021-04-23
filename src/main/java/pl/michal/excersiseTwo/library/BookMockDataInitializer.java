package pl.michal.excersiseTwo.library;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class BookMockDataInitializer {

    private final BookService bookService;

    @PostConstruct
    public void initializeData(){
        createBookRequestList().forEach(bookService::createBook);
    }

    private List<CreateBookRequest> createBookRequestList(){
        List<CreateBookRequest> list = new ArrayList<>();
        list.add(new CreateBookRequest("Madam Ickiewicz", "Tan Padeusz", 1828, 1000000));
        list.add(new CreateBookRequest("Suliusz Jłowacki", "Billadyna", 1829, 8));
        list.add(new CreateBookRequest("Kyprian Namil Corwid", "Jakiś tytuł", 1938, 923));
        return list;
    }
}
