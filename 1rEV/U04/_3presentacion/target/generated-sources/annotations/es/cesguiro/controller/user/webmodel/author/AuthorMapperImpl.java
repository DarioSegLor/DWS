package es.cesguiro.controller.user.webmodel.author;

import es.cesguiro.domain.user.model.Author;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-12T17:25:18+0100",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.40.0.z20241112-1021, environment: Java 17.0.13 (Eclipse Adoptium)"
)
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public AuthorCollection toAuthorCollection(Author author) {
        if ( author == null ) {
            return null;
        }

        long id = 0L;
        String name = null;

        id = author.getId();
        name = author.getName();

        AuthorCollection authorCollection = new AuthorCollection( id, name );

        return authorCollection;
    }
}
