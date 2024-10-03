package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color pumpkin  = new Color (239, 132, 38);
		Color stem = new Color(145, 76, 15);
		Color dark_orange = new Color(219, 105, 6);
		
		StdDraw.setPenColor(stem);
		StdDraw.filledRectangle(0.5, 0.64, .03, .1);
		
		StdDraw.setPenColor(pumpkin);

		StdDraw.filledEllipse(0.4, 0.505, 0.1, 0.175);
		StdDraw.filledEllipse(0.6, 0.505, 0.1, 0.175);
		
		StdDraw.setPenColor(dark_orange);
		
		StdDraw.ellipse(0.6, 0.505, 0.1, 0.175);
		StdDraw.ellipse(0.4, 0.505, 0.1, 0.175);
		
		StdDraw.setPenColor(pumpkin);
		StdDraw.filledEllipse(0.5, 0.5, 0.125, 0.2);
		
		StdDraw.setPenColor(dark_orange);
		StdDraw.ellipse(0.5, 0.5, 0.125, 0.2);
		
		
		
		
	}
}