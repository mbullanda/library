package pl.michal.excersiseTwo.library;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Accessors(chain = true)
@Data
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String author;
    private String title;
    private Integer year;
    private Integer numberOfPages;


}
