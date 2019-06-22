package pl.omernikum.cafe;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeRepo extends CrudRepository<Coffee, Long> {
    //przyjmuje Model 2 warotsci nasza wartosc i typ tej NCII JPA w tym wypadku nasze id z Coffee naszej ID
}
