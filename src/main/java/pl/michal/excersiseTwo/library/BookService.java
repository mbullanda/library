package pl.michal.excersiseTwo.library;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public void createBook(CreateBookRequest request){
        Book book = BookMapper.mapToBookFromRequest(request);
        bookRepository.save(book);
    }

}
