package com.PowerOverStore.PowerOver.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PowerOverStore.PowerOver.model.Product;
import com.PowerOverStore.PowerOver.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository produtoRepository;

    public List<Product> listAllProducts() {
        return produtoRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return produtoRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return produtoRepository.save(product);
    }
 
    public Product updateProduct(Long id, Product productupdated) {
        if (produtoRepository.existsById(id)) {
            productupdated.setId(id);
            return produtoRepository.save(productupdated);
        }
        return null; // ou lançar uma exceção
    }

    public void deleteProduct(Long id) {
        produtoRepository.deleteById(id);
    }

    public Product updateStock(Long id, Integer newStock) {
        Optional<Product> optionalProduct = produtoRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setQuantidadeEstoque(newStock);
            return produtoRepository.save(product);
        }
        return null; // ou lançar uma exceção
    }
}
