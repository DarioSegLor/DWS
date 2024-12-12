package es.cesguiro.controller.admin.webmodel.book;

import es.cesguiro.domain.admin.model.Book;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-12T17:25:18+0100",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.40.0.z20241112-1021, environment: Java 17.0.13 (Eclipse Adoptium)"
)
public class BookMapperImpl implements BookMapper {

    @Override
    public BookCollection toBookCollection(Book book) {
        if ( book == null ) {
            return null;
        }

        String title = null;
        String isbn = null;

        title = book.getTitle();
        isbn = book.getIsbn();

        BookCollection bookCollection = new BookCollection( isbn, title );

        return bookCollection;
    }
}
