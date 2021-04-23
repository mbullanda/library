package pl.michal.excersiseTwo.library;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

}
