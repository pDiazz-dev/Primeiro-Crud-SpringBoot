package com.github.pdiazzdev.produtosApi.repository;

import com.github.pdiazzdev.produtosApi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
    List<Produto> findByNome(String nome);
}
