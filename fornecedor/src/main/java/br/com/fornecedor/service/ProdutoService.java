package br.com.fornecedor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fornecedor.model.Produto;
import br.com.fornecedor.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> getProdutosPorEstado(String estado) {
		return produtoRepository.findByEstado(estado);
	}

	
}
