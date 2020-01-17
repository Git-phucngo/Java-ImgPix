import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.awt.event.*;



class main {
	 public static void main(String args[]){
		
		ImgPro imgpro = new ImgPro();
		
		
		/**/
		BufferedImage image = imgpro.getImg("C:/Users/Sero/Desktop/Software/Github/Java-ImgPix/test_2.jpg");
		int[][] result = imgpro.convert2DImageToPixel(image);
		
		
		System.out.println(result[0][0]);
		/*
	     for(int i = 0; i < result.length; i++) {
	    	 System.out.println(Arrays.toString(result[i]));
	     }
		 */
		
		

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