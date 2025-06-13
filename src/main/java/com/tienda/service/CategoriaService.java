
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

//Define los metodos a exponer a consumidores
public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos);

}
