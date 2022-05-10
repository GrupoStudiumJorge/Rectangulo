package es.studium.EjemploUno;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Rectangulo extends Frame implements WindowListener
{
	private static final long serialVersionUID = 1L;
	public Rectangulo()
	{
		addWindowListener(this);
		setSize(200,100);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		g.drawRect(85, 50, 25, 25);
	}
	public static void main(String[] args)
	{
		new Rectangulo();
	}
	@Override
	public void windowOpened(WindowEvent e){}
	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e){}
	@Override
	public void windowIconified(WindowEvent e){}
	@Override
	public void windowDeiconified(WindowEvent e){}
	@Override
	public void windowActivated(WindowEvent e){}
	@Override
	public void windowDeactivated(WindowEvent e){}
}