package pl.michal.excersiseTwo.library;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/library")
@RequiredArgsConstructor
@Slf4j
public class BookController {

    private final BookService bookService;



}
