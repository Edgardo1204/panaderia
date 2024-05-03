/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;
import java.time.LocalDateTime;

/**
 *
 * @author Jairo Martinez
 */
public class Ventas {
    public String IdVenta;
    public String nobmbreProducto;
    public String cantidad;
    public String precio;
    public Date fecha;

    public Ventas(String IdVenta, String nobmbreProducto, String cantidad, String precio, Date fecha) {
        this.IdVenta = IdVenta;
        this.nobmbreProducto = nobmbreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(String IdVenta) {
        this.IdVenta = IdVenta;
    }

    public String getNobmbreProducto() {
        return nobmbreProducto;
    }

    public void setNobmbreProducto(String nobmbreProducto) {
        this.nobmbreProducto = nobmbreProducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }  
}
