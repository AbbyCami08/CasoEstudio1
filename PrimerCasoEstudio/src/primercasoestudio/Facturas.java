/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primercasoestudio;

import javax.swing.JOptionPane;

/**
 *
 * @author WChavarria
 */
public class Facturas {
    private String nombreCliente;
    private String cedulaCliente;
    private String codigoCliente;
    private double montoCliente;
    private int numeroMes;
    private boolean productosElectricos;
    private boolean productosAutomotrices;
    private boolean productosConstruccion;

    public Facturas(String nombreCliente, String cedulaCliente, String codigoCliente, double montoCliente, int numeroMes, boolean productosElectricos, boolean productosAutomotrices, boolean productosConstruccion) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoCliente = codigoCliente;
        this.montoCliente = montoCliente;
        this.numeroMes = numeroMes;
        this.productosElectricos = productosElectricos;
        this.productosAutomotrices = productosAutomotrices;
        this.productosConstruccion = productosConstruccion;
    }
//Getters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public double getMontoCliente() {
        return montoCliente;
    }

    public int getNumeroMes() {
        return numeroMes;
    }

    public boolean isProductosElectricos() {
        return productosElectricos;
    }

    public boolean isProductosAutomotrices() {
        return productosAutomotrices;
    }

    public boolean isProductosConstruccion() {
        return productosConstruccion;
    }
    
    public boolean productosElectricos() {
        return productosElectricos;
        
}
    public boolean productosAutomotrices() {
        return productosAutomotrices;
}
    
    public boolean productosConstruccion() {
        return productosConstruccion;
    }
    
//Setters

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setMontoCliente(double montoCliente) {
        this.montoCliente = montoCliente;
    }

    public void setNumeroMes(int numeroMes) {
        this.numeroMes = numeroMes;
    }
    
    public void setproductosElectricos(boolean productosElectricos) {
        this.productosElectricos = productosElectricos;
        
    }
    
    public void productosAutomotrices(boolean productosAutomotrices) {
        this.productosAutomotrices = productosAutomotrices;
        
    }
    public void productosConstruccion(boolean productosConstruccion) {
        this.productosConstruccion = productosConstruccion;
    }
    
// Método para mostrar factura
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Factura: " + codigoCliente +
                "\nCliente: " + nombreCliente + " - Cédula: " + cedulaCliente +
                "\nMonto: " + montoCliente +
                "\nMes: " + obtenerMes(numeroMes));
    }
    
// Método para obtener el nombre del mes
    private String obtenerMes(int numeroMes) {
        switch (numeroMes) {
            case 1: return "enero";
            case 2: return "febrero";
            case 3: return "marzo";
            case 4: return "abril";
            case 5: return "mayo";
            case 6: return "junio";
            case 7: return "julio";
            case 8: return "agosto";
            case 9: return "septiembre";
            case 10: return "octubre";
            case 11: return "noviembre";
            case 12: return "diciembre";
            default: return "mes inválido";
        }
    }