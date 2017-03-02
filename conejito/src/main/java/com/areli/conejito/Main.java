/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.areli.conejito;
import java.awt.Color;
import oracle.forms.ui.VBean;
import javax.swing.JLabel;
/**
 *
 * @author asortega
 */
public class Main extends VBean {
    
    JLabel label = new JLabel();
    
    public Main(){
      
        setSize(500, 500);
        setVisible(true);
        add(label);
        label.setSize(500, 500);
        label.setBackground(Color.PINK);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imagen2.png")));
    }

     

    
    
}
