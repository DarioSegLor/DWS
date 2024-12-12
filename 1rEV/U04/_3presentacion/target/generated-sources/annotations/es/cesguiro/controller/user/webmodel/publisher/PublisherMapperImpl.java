package es.cesguiro.controller.user.webmodel.publisher;

import es.cesguiro.domain.user.model.Publisher;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-12T17:25:18+0100",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.40.0.z20241112-1021, environment: Java 17.0.13 (Eclipse Adoptium)"
)
public class PublisherMapperImpl implements PublisherMapper {

    @Override
    public PublisherCollection toPublisherCollection(Publisher publisher) {
        if ( publisher == null ) {
            return null;
        }

        String name = null;

        name = publisher.getName();

        long id = 0L;

        PublisherCollection publisherCollection = new PublisherCollection( id, name );

        return publisherCollection;
    }
}
