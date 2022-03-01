package com.test.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
        
    @Autowired
    RepositoryClass productRepository;
    
    public List<EntityClass> getAllProduct(){
        return productRepository.findAll();
    }
        
    public EntityClass getProduct(int id){
        return productRepository.findById(id).get();
    }
        
    public void addProduct(EntityClass pe){
        productRepository.save(pe);
    }
        
    public void updateProduct(int id, EntityClass pe){
        if(productRepository.findById(id).isPresent()) {
            EntityClass oldProductEntity=productRepository.findById(id).get();
            oldProductEntity.setName(pe.getName());
            oldProductEntity.setDescription(pe.getDescription());
            productRepository.save(oldProductEntity);
        }
    }
        
    public void deleteProduct(int id){
        productRepository.deleteById(id);       
    }
}



