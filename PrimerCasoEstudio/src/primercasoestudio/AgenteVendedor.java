/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primercasoestudio;

/**
 *
 * @author WChavarria
 */
public class AgenteVendedor {
    private String nombre;
    private String cedula;
    private String codigo;
    private String sucursal;

    // Constructores
    public AgenteVendedor(String nombre, String cedula, String codigo, String sucursal) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
    }
//Getters
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getSucursal() {
        return sucursal;
    }
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    
}




    