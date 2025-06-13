

package com.tienda.service.impl;
import com.tienda.dao.CategoriaDao;
import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

//Define la logica de los metodfos de la interfaz que Implementa  
public class CategoriaServiceImpl implements CategoriaService{
    
    //Inyeccicon
    @Autowired
    private CategoriaDao categoriadao;
            
    @Override
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> lista = categoriadao.findAll();
        
        //filtrar solo los activos
        if (activos) {
            lista.removeIf(cat -> !cat.isActivo());
        }

        return lista;
    }
}
