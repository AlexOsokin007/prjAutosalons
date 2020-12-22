package com.site.carsite.repos;
import com.site.carsite.domain.Color;
import org.springframework.data.repository.CrudRepository;


public interface ColorRepo extends CrudRepository<Color, Integer> {
    // Contract findByName(String name);

}