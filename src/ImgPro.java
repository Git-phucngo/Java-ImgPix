import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Arrays;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.List;
import javax.swing.*;

public class ImgPro {

	public ImgPro() {
		
	}
	
	
	public BufferedImage getImg(String url) {
		BufferedImage img = null;
		
		try {
			img = ImageIO.read(new File(url));			
		}
		catch (IOException e) { 		}
		
		return img;
	}

	
	public int[][] convert2DImageToPixel(BufferedImage img){

	      final byte[] pixels = ((DataBufferByte) img.getRaster().getDataBuffer()).getData();
	      final int width = img.getWidth();
	      final int height = img.getHeight();
	      //final boolean hasAlphaChannel = img.getAlphaRaster() != null;

	      int[][] result = new int[height][width];
	      final int pixelLength = 3;
	      for (int pixel = 0, row = 0, col = 0; pixel + 2 < pixels.length; pixel += pixelLength) {
	            int argb = 0;
	            argb += 0; // 255 alpha - 16777216
	            System.out.println(pixels[pixel] & 0xff);
	            
	            argb += (int) pixels[pixel] & 0xff; // blue
	            //argb += (((int) pixels[pixel + 1] & 0xff) << 8); // green
	            //argb += (((int) pixels[pixel + 2] & 0xff) << 16); // red
	            result[row][col] = argb;
	            col++;
	            System.out.println(argb);
	            if (col == width) {
	               col = 0;
	               row++;
	            }
	         }
	      
	      return result;
	}
	      
    
		

	
	public static Image getImageFromArray(int[] pixels, int width, int height) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        WritableRaster raster = (WritableRaster) image.getData();
        raster.setPixels(0,0,width,height,pixels);
        return image;
    }
	



}
