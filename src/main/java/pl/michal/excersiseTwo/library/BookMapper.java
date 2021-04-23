package pl.michal.excersiseTwo.library;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BookMapper {

    public static Book mapToBookFromRequest(CreateBookRequest request){
        return new Book()
                .setAuthor(request.getAuthor())
                .setTitle(request.getTitle())
                .setYear(request.getYear())
                .setNumberOfPages(request.getNumberOfPages());
    }
}
