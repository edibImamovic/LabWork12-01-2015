package com.bitcamp.stack.queues.ADT;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class StackQueuesADT extends JPanel {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel window = new JPanel();

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		window.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mouseClicked(MouseEvent e) {
				Component c = (Component) e.getSource();
				Graphics g = c.getGraphics();
				g.fillRect(20, 20, 100, 100);
			}

		});

		frame.setContentPane(window);
	
		frame.setVisible(true);

	} 

}