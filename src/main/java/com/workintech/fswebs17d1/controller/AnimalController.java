package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workintech")
public class AnimalController {
    Map<Integer, Animal> animals = new HashMap<>();


    @GetMapping("/animal")
    public List<Animal> animalList(){
        return new ArrayList<>(animals.values());
    }


    @GetMapping("/animal/{id}")
    public Animal animalListId(@PathVariable int id){
        return animals.get(id);
    }

    @PostMapping("/animal")
    public Animal postAnimal(@RequestBody Animal animal){
     animals.put(animal.getId(), animal);
     return animal;
    }
    // [PUT] /workintech/animal/{id}
    @PutMapping("/animal/{id}")
    public Animal updateAnimal(@PathVariable int id, @RequestBody Animal animal) {
        animals.put(id, animal);
        return animal;
    }

    // [DELETE] /workintech/animal/{id}
    @DeleteMapping("/animal/{id}")
    public Animal deleteAnimal(@PathVariable int id) {
        return animals.remove(id);
    }
}
