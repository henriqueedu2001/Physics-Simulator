package Graphics;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Geometry.vector;

public class RenderEngine {
    JFrame main_window;
    Panel main_panel;
    
    int default_width = 640;
    int default_height = 360;

    public RenderEngine() {
        main_window = new JFrame("Phisics Engine");
        main_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_panel = new Panel();
        main_panel.setSize(default_width, default_height);
        main_window.add(main_panel);
    }
    
    public void show() {
        main_window.setVisible(true);
        main_window.setSize(default_width, default_height);
    }
}

class Panel extends JPanel {
    Graphics graphics;
    Camera main_camera;

    public Panel() {
        main_camera = new Camera(new vector(), new vector(0.0, 0.0, 1.0), 10.0);
        main_camera.showInfo();
    }

    public void paintComponent(Graphics g) {
        graphics = g;
        super.paintComponent( graphics );
        draw(graphics);
    }

    public void draw(Graphics g) {
        g.drawLine(0, 0, getWidth(), getHeight());
    }
}