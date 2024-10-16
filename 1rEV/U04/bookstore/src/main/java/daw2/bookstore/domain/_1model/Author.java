package daw2.bookstore.domain._1model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    public long id;
    public String name;
    public String nationality;
    public String biography;
    public int birthYear;
    public int deathYear;
}