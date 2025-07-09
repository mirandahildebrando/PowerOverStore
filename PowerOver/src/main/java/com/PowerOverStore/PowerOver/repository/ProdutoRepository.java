package com.PowerOverStore.PowerOver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PowerOverStore.PowerOver.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário

}
