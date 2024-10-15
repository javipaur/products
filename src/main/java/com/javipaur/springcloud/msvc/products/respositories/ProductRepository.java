package com.javipaur.springcloud.msvc.products.respositories;


import org.springframework.data.repository.CrudRepository;

import com.javipaur.springcloud.msvc.products.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Long> {
    

}
