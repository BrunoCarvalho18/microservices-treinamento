package br.com.fornecedor.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fornecedor.model.InfoFornecedor;
import br.com.fornecedor.repository.InfoRepository;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;
	
	public List<InfoFornecedor> getInfoPorEstado(String estado) {
		return infoRepository.findByEstado(estado);
	}
}
