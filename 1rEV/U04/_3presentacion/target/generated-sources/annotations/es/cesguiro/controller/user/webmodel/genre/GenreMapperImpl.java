package es.cesguiro.controller.user.webmodel.genre;

import es.cesguiro.domain.user.model.Genre;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-12T17:25:18+0100",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.40.0.z20241112-1021, environment: Java 17.0.13 (Eclipse Adoptium)"
)
public class GenreMapperImpl implements GenreMapper {

    @Override
    public List<String> toGenreNameList(List<Genre> genres) {
        if ( genres == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( genres.size() );
        for ( Genre genre : genres ) {
            list.add( toGenreName( genre ) );
        }

        return list;
    }
}
