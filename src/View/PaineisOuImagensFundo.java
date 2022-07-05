/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author bigolho16
 */
public class PaineisOuImagensFundo extends javax.swing.JPanel {

    private ImageIcon img;

    public PaineisOuImagensFundo() {
        this.img = new ImageIcon();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
    }
    
    public ImageIcon getImg(){
        return this.img;
    }
    
    public void setImg(ImageIcon img){
        this.img = img;
    }
}
