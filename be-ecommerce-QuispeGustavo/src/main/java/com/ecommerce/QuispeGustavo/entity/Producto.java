package com.ecommerce.QuispeGustavo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "productos")
@NamedQueries({
    @NamedQuery(
        name = "Producto.findByCategoriaNamed",
        query = "SELECT p FROM Producto p WHERE LOWER(p.categoria) = LOWER(:categoria)"
    )
})
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String categoria;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal precio;

    @Column(nullable = false)
    private Integer stock;
    
    @Column(nullable = false, length = 100)
    private String marca;

    @Column(nullable = false, length = 100)
    private String codigo_barras;
    
    public Producto() {}

    public Producto(String nombre, String categoria, BigDecimal precio, Integer stock,
    		String marca, String codigo_barras) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.marca = marca;
        this.codigo_barras = codigo_barras;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public BigDecimal getPrecio() { return precio; }
    public void setPrecio(BigDecimal precio) { this.precio = precio; }
    public Integer getStock() { return stock; }
    public void setStock(Integer stock) { this.stock = stock; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getCodigo_barras() { return codigo_barras; }
    public void setCodigo_barras(String codigo_barras) { this.codigo_barras = codigo_barras; }
    
}