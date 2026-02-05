package com.example.tienda.model; 

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity

@Table(name="cliente") public class Tienda {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY) private Long id;
    
    private String nombre;
    private String correo; 
    private String telefono;
    
    @Column(name="fecha_registro") private LocalDateTime fecharegistro = LocalDateTime.now();
   

}
