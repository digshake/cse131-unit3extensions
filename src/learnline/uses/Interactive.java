package learnline.uses;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

import learnline.LinearRegression;
import edu.princeton.cs.introcs.StdDraw;
/**
 * 
 * @author Tom Larsen
 *
 */
public class Interactive {
	public static void main(String[] args) {
		LinearRegression lr = new LinearRegression();
		List<Double> xs = new LinkedList<Double>();
		List<Double> ys = new LinkedList<Double>();
		while(true) {
			StdDraw.clear();
			while (!StdDraw.isMousePressed()) {
				StdDraw.pause(20);
			}
			while (StdDraw.isMousePressed()) {
				StdDraw.pause(20);
			}
			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();
			xs.add(x);
			ys.add(y);
			lr.accept(x, y);
			StdDraw.setPenRadius(0.04);
			StdDraw.setPenColor(Color.RED);
			for (int i=0; i < xs.size(); ++i) {
				StdDraw.point(xs.get(i), ys.get(i));
			}
			StdDraw.setPenRadius(0.007);
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.line(0,lr.predictY(0),1, lr.predictY(1));
			StdDraw.show(10);
		}
	}
}