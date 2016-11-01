package graphics.view;

import javax.swing.JFrame;
import graphics.controller.GraphicsController;

public class GraphicViewer extends JFrame
{
	
	private GraphicsController baseController;
	
	public GraphicViewer(GraphicsController baseController)
	{
		super();
		this.baseController = baseController;
		
	}
}
