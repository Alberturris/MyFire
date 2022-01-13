package myfire;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Alberto
 */
public class MyFire extends JFrame{

    public  final Viewer v = new Viewer();
    public final ControlPanel cp = new ControlPanel();


    public MyFire() {

        initComponents();
        initControlPanel();
        initViewer();
    }


    private void initComponents() {
        
        this.setLayout(new BorderLayout());
        this.setSize(1500, 900);
        this.setResizable(true);
        this.setTitle("MY FIRE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();

        Dimension tamanoPantalla = miPantalla.getScreenSize();

        int anchoPantalla = tamanoPantalla.width;
        int altoPantalla = tamanoPantalla.height;
        
        this.setLocation(anchoPantalla / 10, altoPantalla / 10);
        
    }

    private void initViewer() {

        Thread tViewer = new Thread(v);
        add(v, BorderLayout.CENTER);
        tViewer.start();
    }
    
    private void initControlPanel(){
//        cp.setMaximumSize(new Dimension(600,200));
//        cp.setMinimumSize(new Dimension(600,200));
        add(cp, BorderLayout.WEST);
       
    }
    
    public static void main(String[] args) {

        new MyFire().setVisible(true);
    }
}
