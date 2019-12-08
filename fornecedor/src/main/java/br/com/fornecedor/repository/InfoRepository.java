package br.com.fornecedor.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import br.com.fornecedor.model.InfoFornecedor;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {

	@Query(value= "select * from info_fornecedor where estado = (:estado)", nativeQuery= true)
	List<InfoFornecedor> findByEstado(@Param("estado") String estado);
	
	
}
