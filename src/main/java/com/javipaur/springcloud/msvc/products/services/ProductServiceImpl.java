package com.javipaur.springcloud.msvc.products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javipaur.springcloud.msvc.products.entities.Product;
import com.javipaur.springcloud.msvc.products.respositories.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService{

    //@Autowired
    final private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

}
