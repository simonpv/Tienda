
package com.tienda.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
import nonapi.io.github.classgraph.json.Id;


@Data       
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {
    
    //Version de Serializacion
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column (name = "id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    public Categoria() {
        
    }
    
    public Categoria(String descripcion, String rutaImage, boolean activo){
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }            
    

}
