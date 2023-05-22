import javax.swing.JFrame;

public class Game extends JFrame{

	Game(){
			
		this.add(new GamePanel());
		this.setTitle("Harjot's SNAKE");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}
