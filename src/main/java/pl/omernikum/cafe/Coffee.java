package pl.omernikum.cafe;

import org.springframework.stereotype.Service;

import javax.persistence.*;

@Entity
public class Coffee {

    @Id //nasza encja JPA
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;

    public Coffee() {
    }

    public Coffee(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
