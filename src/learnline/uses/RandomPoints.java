package learnline.uses;

import java.awt.Color;

import cse131.ArgsProcessor;
import learnline.LinearRegression;
import edu.princeton.cs.introcs.StdDraw;

public class RandomPoints {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("how many points?");
		LinearRegression lr = new LinearRegression();
		StdDraw.setPenRadius(.04);
		for (int i=0; i < n; ++i) {
			double x = Math.random();
			double y = Math.random();
			lr.accept(x,y);
			StdDraw.point(x, y);
		}
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(.007);
		StdDraw.line(0, lr.predictY(0), 1, lr.predictY(1));

	}

}
