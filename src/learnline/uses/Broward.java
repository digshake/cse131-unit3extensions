package learnline.uses;

import cse131.ArgsProcessor;
import learnline.LinearRegression;
import edu.princeton.cs.introcs.StdIn;

public class Broward {

	public static void main(String[] args) {
		ArgsProcessor.useStdInput("datafiles/housing");
		double[] xy = StdIn.readAllDoubles();
		LinearRegression lr = new LinearRegression();
		for (int i=0; i < xy.length; i=i+2) {
			lr.accept(xy[i], xy[i+1]);
		}
		ArgsProcessor ap = new ArgsProcessor(args);
		while(true) {
			double feet = ap.nextDouble("Square feet?");
			System.out.println("A house of " + feet + " sq feet costs $" + Math.round(lr.predictY(feet)));
		}
	}

}
