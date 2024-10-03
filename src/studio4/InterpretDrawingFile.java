package studio4;

import java.awt.Color;
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
		
		StdDraw.setPenColor(Color.GREEN);
	//	StdDraw.filledRectangle(.2, .2, .2, .3);
		
	//	StdDraw.filledCircle(.5, .5, .1);
		StdDraw.arc(0.5, 0.5, 0.1, 0, 90);
}
	
}
