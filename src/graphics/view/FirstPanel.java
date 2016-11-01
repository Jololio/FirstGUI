package graphics.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import graphics.controller.GraphicsController;

public class FirstPanel extends JPanel
{
	private GraphicsController baseController;
	private JButton colorButton;
	private JButton randomButton;
	
	public FirstPanel(GraphicsController baseController)
	{
		super();
		this.baseController = baseController;
		
		this.colorButton = new JButton("Niiiiice Tryyyy");
		this.randomButton = new JButton("ez");
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.ORANGE);
		this.add(colorButton);
		this.add(randomButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}


}
