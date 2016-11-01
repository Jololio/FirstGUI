package graphics.view;

import java.awt.Dimension;
import javax.swing.JFrame;
import graphics.controller.GraphicsController;

public class GraphicViewer extends JFrame
{
	
	private GraphicsController baseController;
	
	public GraphicViewer(GraphicsController baseController)
	{
		super();
		this.baseController = baseController;
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(new Dimension(600, 400));
		this.setVisible(true);
	}
}
