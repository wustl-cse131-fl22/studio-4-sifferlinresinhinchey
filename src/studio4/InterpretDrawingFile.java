package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		
		
		if (shapeType.equals("ellipse")) {
			StdDraw.setPenColor(red, green, blue);
			if (isFilled == true) {
				StdDraw.filledEllipse(x, y, x1, y1);}
			else {
				StdDraw.ellipse(x, y, x1, y1);}}
		
		if (shapeType.equals("triangle")) {
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			StdDraw.setPenColor(red, green, blue);
			if(isFilled == true) {
				double[] arrayX = {x,x1,x2};
				double[] arrayY = {y,y1,y2};
				StdDraw.filledPolygon(arrayX, arrayY);}
			else {
				double[] arrayX = {x,x1,x2};
				double[] arrayY = {y,y1,y2};
				StdDraw.filledPolygon(arrayX, arrayY);
			}
		}
		if (shapeType.equals("rectangle")) {
			StdDraw.setPenColor(red, green, blue);
			if(isFilled ==true) {
				StdDraw.filledRectangle(x, y, x1, y1);}
			else {
				StdDraw.rectangle(x, y, x1, y1);}
				
			}
		
	
		
		
		
	}
}
