package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.ORANGE);
		StdDraw.filledRectangle(.35, .5, .65, .25);
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.line(0, .6, 1, .6);
		StdDraw.line(0, .4, 1, .4);
		StdDraw.line(.0,.25, 1,.75);
		StdDraw.line(0, .75, 1, .25);
		StdDraw.setPenColor(Color.CYAN);
		StdDraw.filledCircle(.5, .5, .2);
		
	}
}