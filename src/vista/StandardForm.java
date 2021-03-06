/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Callback;

/**
 * Standard Form, clase de formulario genérico que permite
 * el uso de diferentes funcionalidades extra.
 * @author Carlos Chavez Laguna
 */
abstract public class StandardForm extends javax.swing.JFrame{

    
    public void messageBox(String title,String message){
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.INFORMATION_MESSAGE);
    }    
    
    public void messageBox(String title,String message,Callback<Boolean> onAnswer){        
        int answer=(JOptionPane.showConfirmDialog(this, message, title, JOptionPane.YES_NO_OPTION));
        onAnswer.execute(new Boolean []{ 0==answer});
    }
    
    public void messageBoxAlert(String title,String message){
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.WARNING_MESSAGE);
    }    
    
    public void messageBoxError(String title,String message){
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.ERROR_MESSAGE);
    }
    
    
    /**
     * maximize <br>
     * maximizar el tamaño de la ventana
     *      
    */ 
    public void maximize(){        
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }
    
   
    /**
     * windowAlignCenter <br>
     * ubicar la ventana justo al centro de la pantalla
     *      
    */ 
    public void windowAlignCenter(){
        this.setLocationRelativeTo(null);
    }

    /**
     * Sobreescribir método para obtener generar controlador
     */
    public void createController(){
        //...
    }
    
    /**
     * Permite obtener el controlador de la vista
     * 
     * @return objeto que se convertirá en el controlador
     */
    public abstract Object getViewController();
    
    
}
