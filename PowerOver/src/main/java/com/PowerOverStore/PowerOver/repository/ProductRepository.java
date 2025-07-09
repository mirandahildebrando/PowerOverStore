package com.PowerOverStore.PowerOver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PowerOverStore.PowerOver.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário

}
