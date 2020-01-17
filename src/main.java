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

		
		int size = 1500000;
		int[] newArray = new int[size];
		int index = 0;
		
		for (int row = 0; row < result.length; row++) { 
			for (int col = 0; col < result[row].length; col++) {
				newArray[index++] = result[row][col];
			}
		}

		
		
		Image test;
		test = imgpro.getImageFromArray(newArray, 300, 300);
		
	
		
		

		 JFrame editorFrame = new JFrame("Image Demo");
		 
		 ImageIcon imageIcon = new ImageIcon(test);
	     JLabel jLabel = new JLabel();
	     jLabel.setIcon(imageIcon);
	     editorFrame.getContentPane().add(jLabel, BorderLayout.CENTER);

	     editorFrame.pack();
	     editorFrame.setLocationRelativeTo(null);
	     editorFrame.setVisible(true);
	     
	     
	


	     
	     
	 }
}