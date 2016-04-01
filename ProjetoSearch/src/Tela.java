import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela extends JFrame {

	
	
	public void tela (){
		
		JFrame frame = new JFrame();
    	JButton botao = new JButton();
    	
    	
    	setSize(800,600);
        setVisible(true);
        getContentPane().add(botao);
	}
}
