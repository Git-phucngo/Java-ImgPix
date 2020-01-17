import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImgPro {

	public ImgPro() {
		
	}
	
	
	public BufferedImage getImg(String dir) {
		BufferedImage img = null;
		
		try {
			img = ImageIO.read(new File(dir));			
		}
		catch (IOException e) { 		}
		
		return img;
	}



}
