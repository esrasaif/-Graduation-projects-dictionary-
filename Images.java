/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduationprojects;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author 074t
 */
public class Images extends JFrame{

    private ImageIcon little19;
    private JLabel label1;
    private ImageIcon ptotect9;
    private JLabel label2;
    private ImageIcon your1;
    private JLabel label3;
    private ImageIcon arabic1;
    private JLabel label4;
    private ImageIcon tir2;
    private JLabel label5;
    private ImageIcon maham2;
    private JLabel label6;
    
    Images(){
        setLayout(new FlowLayout());
    }
    
    public void show1(){
           little19 = new ImageIcon("little farmer.jpg");
           label1 = new JLabel (little19);
           add(label1);
           ptotect9 = new ImageIcon("protect your childern.jpg");
           label2 = new JLabel (ptotect9);
           add(label2);
    }
    public void show2(){
           your1 = new ImageIcon("your tour.jpg");
           label3 = new JLabel (your1);
           add(label3);
           arabic1 = new ImageIcon("arabic.jpg");
           label4 = new JLabel (arabic1);
           add(label4);
    }
    public void show3(){
           tir2 = new ImageIcon("tiryaaq.jpg");
           label5 = new JLabel (tir2);
           add(label5);
           maham2 = new ImageIcon("maham.jpg");
           label6 = new JLabel (maham2);
           add(label6);
    }
}
