package com.site.carsite.repos;
import com.site.carsite.domain.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

public interface BrandRepo extends CrudRepository<Brand, Integer> {
    // Contract findByName(String name);

}