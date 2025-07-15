
package com.tienda.dao;

import com.tienda.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {

    //public void deleteById(Categoria categoria);
    
    List<Categoria> findByDescripcionContainingIgnoreCase(String descripcion);

}
