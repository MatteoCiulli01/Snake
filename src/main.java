import javax.swing.JFrame;

public class main {

	public main()
	{
		JFrame frame = new JFrame();//finestra
		Gamepanel gamepanel = new Gamepanel();
		
		frame.add(gamepanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //serve a chiudere l'app
		frame.setTitle("SNAKE FOR DUMMIES");
		
		frame.pack(); //for size the frame
		frame.setVisible(true);
		frame.setLocationRelativeTo(null); //the window is placed in the center of the screen 

	}
	public static void main(String[] args)
	{
		new main();
	}
}
