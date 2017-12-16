package view;

import model.PaintMainModel;
import model.Shape;

import javax.swing.*;
import java.awt.*;

public class DrawingFrame extends JPanel{
	
	private static final long serialVersionUID = 1L;

	PaintMainModel model;
	
	public DrawingFrame(PaintMainModel model){
		this.model = model;
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(Shape s: model.getShapeList()){
        	s.paint(g2);
        }
    }

	public void setModel(PaintMainModel model) {
		this.model = model;
	}
	
	
	
}
