package com.produtos.apiproduto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apiproduto.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	Produto findById(long id);
}
