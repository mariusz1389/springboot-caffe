package pl.omernikum.cafe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController//do tworzenia restowego api
@RequestMapping("/api")
public class CaffeApi {
    

    private CoffeeRepo coffeeRepo;

    @Autowired
    public CaffeApi(CoffeeRepo coffeeRepo) {
        this.coffeeRepo = coffeeRepo;
    }


    @GetMapping
    public Iterable<Coffee> getCoffes() {
        return coffeeRepo.findAll();
    }

    @PostMapping
    public void addCoffee(@RequestBody Coffee coffee)
    {
        coffeeRepo.save(coffee);
    }

    @DeleteMapping
    public void removeCoffe(@RequestParam Long id) {
        coffeeRepo.deleteById(id);
    }

    @PutMapping
    public void putCoffee(@RequestBody Coffee coffee)
    {
        Optional<Coffee> element = coffeeRepo.findById(coffee.getId());
        if(element.isPresent())
        {
            coffeeRepo.save(coffee);
        }
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void get() {
//        Coffee coffee1 = new Coffee("Prima", "Black");
//        Coffee coffee2 = new Coffee("Czibo", "Black");
//        Coffee coffee3 = new Coffee("Jacobs", "Black");
//        coffeeRepo.save(coffee1);
//        coffeeRepo.save(coffee2);
//        coffeeRepo.save(coffee3);
//    }



}
