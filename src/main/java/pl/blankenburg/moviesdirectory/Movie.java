package pl.blankenburg.moviesdirectory;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Movie {

    @Id
    private UUID id;

    private String name;


    public Movie() {
        id = UUID.randomUUID();
    }

    public Movie(String name) {
        this();
        this.name = name;
    }
}
