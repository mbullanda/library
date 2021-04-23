package pl.michal.excersiseTwo.library;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateBookRequest {

    private String author;
    private String title;
    private Integer year;
    private Integer numberOfPages;
}
