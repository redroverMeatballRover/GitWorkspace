import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.text.html.HTMLDocument.Iterator;


public class ImageUtilities {

	public static void main(String[] args) {
		
		
		
	}
	
	public static String getFormat(InputStream stream) throws IOException 
	{
		    ImageInputStream iis = ImageIO.createImageInputStream(stream);
		    java.util.Iterator<ImageReader> iter = ImageIO.getImageReaders(iis);
		    if (!iter.hasNext()) {
		      throw new IOException("Unsupported image format!");
		    }
		    ImageReader reader = (ImageReader) iter.next();
		    iis.close();
		    return reader.getFormatName();
	}
	 
	 public static BufferedImage loadImage(InputStream stream) throws IOException 
	 {
		 return ImageIO.read(stream);
	 }
	 
	 public static void saveImageAsJPEG(BufferedImage image, OutputStream stream) throws IOException {
		    ImageIO.write(image, "jpg", stream);
	 }

	 public static void saveImageAsJPEG(BufferedImage image,
		      OutputStream stream, int qualityPercent) throws IOException {
		    if ((qualityPercent < 0) || (qualityPercent > 100)) {
		      throw new IllegalArgumentException("Quality out of bounds!");
		    }
		    float quality = qualityPercent / 100f;
		    ImageWriter writer = null;
		    java.util.Iterator<ImageWriter> iter = ImageIO.getImageWritersByFormatName("jpg");
		    if (iter.hasNext()) {
		      writer = (ImageWriter) iter.next();
		    }
		    ImageOutputStream ios = ImageIO.createImageOutputStream(stream);
		    writer.setOutput(ios);
		    ImageWriteParam iwparam = new JPEGImageWriteParam(Locale.getDefault());
		    iwparam.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
		    iwparam.setCompressionQuality(quality);
		    writer.write(null, new IIOImage(image, null, null), iwparam);
		    ios.flush();
		    writer.dispose();
		    ios.close();
		  }

		  /**
		   * Writes an image to an output stream as a PNG file.
		   * 
		   * @param image
		   *            image to be written
		   * @param stream
		   *            target stream
		   * 
		   * @throws IOException
		   *             if an I/O error occured
		   */
		  public static void saveImageAsPNG(BufferedImage image, OutputStream stream)
		      throws IOException {
		    ImageIO.write(image, "png", stream);
		  }

		  private static BufferedImage convertToARGB(BufferedImage srcImage) {
		    BufferedImage newImage = new BufferedImage(srcImage.getWidth(null),
		        srcImage.getHeight(null), BufferedImage.TYPE_INT_ARGB);
		    Graphics bg = newImage.getGraphics();
		    bg.drawImage(srcImage, 0, 0, null);
		    bg.dispose();
		    return newImage;
		  }
}
