package com.reactive.spring.web;

import com.reactive.spring.model.City;
import com.reactive.spring.repository.CityRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CityController {

    private final CityRepository repository;

    public CityController(final CityRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cities/{id}")
    public Mono<City> findById(@PathVariable String id) {
        return this.repository.findById(id);
    }

    @GetMapping(value = "/cities")
    public Flux<City> all() {
        return this.repository.findAll()
                //.filter(c -> c.getCountry().equals("USA"))
                //.map(City::getName)
        ;
    }
}
