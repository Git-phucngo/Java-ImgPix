import java.awt.*;
import java.awt.image.*;
import javax.swing.*;



class main {
	 public static void main(String args[]){
		
		ImgPro imgpro = new ImgPro();
		
		
		/**/
		BufferedImage image = imgpro.getImg("C:/Users/Sero/Desktop/Software/Github/Java-ImgPix/test_1.png");
		
		
		
		
		
		
		
		 JFrame editorFrame = new JFrame("Image Demo");
		 
		 ImageIcon imageIcon = new ImageIcon(image);
	     JLabel jLabel = new JLabel();
	     jLabel.setIcon(imageIcon);
	     editorFrame.getContentPane().add(jLabel, BorderLayout.CENTER);

	     editorFrame.pack();
	     editorFrame.setLocationRelativeTo(null);
	     editorFrame.setVisible(true);
	 }
}