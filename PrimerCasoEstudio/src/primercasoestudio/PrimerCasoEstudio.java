/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primercasoestudio;

import javax.swing.JOptionPane;

/**
 *
 * @author WChavarria
 */
public class PrimerCasoEstudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se solicitan los datos del vendedor
        String nombreVendedor = JOptionPane.showInputDialog("Digite el nombre del vendedor:");
        String cedulaVendedor = JOptionPane.showInputDialog("Digite la cédula del vendedor:");
        String codigoVendedor = JOptionPane.showInputDialog("Digite el código del vendedor:");
        String sucursal = JOptionPane.showInputDialog("Digite la sucursal del vendedor:");
        
        // Se guardan los daros del venderdor
        AgenteVendedor vendedor = new AgenteVendedor(nombreVendedor, cedulaVendedor, codigoVendedor, sucursal);
        
        
        
        
    }
    
}
