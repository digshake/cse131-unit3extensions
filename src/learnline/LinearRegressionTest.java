package learnline;

import org.junit.Assert;
import org.junit.Test;

public class LinearRegressionTest {
	@Test
	public void testSlopeIntercept() {
		for (int i=0; i<100; i++) {
			double slope = i/10d*Math.random();
			double intercept = i+1;
			double[] xs = new double[100];
			for (int j=0; j<xs.length; j++)
				xs[j] = j;
			double[] ys = new double[xs.length];
			for (int j=0; j<xs.length; j++)
				ys[j] = slope*xs[j]+intercept;
			LinearRegression lr = new LinearRegression();
			for (int j=0; j < xs.length; ++j) {
				lr.accept(xs[j], ys[j]);
			}
			Assert.assertEquals(slope, lr.getSlope(), 0.1);
			Assert.assertEquals(intercept, lr.getIntercept(), 0.1);
		}
		
		for (int i=0; i<100; i++) {
			double slope = i/10d*Math.random();
			double intercept = i+1;
			double[] xs = new double[100];
			for (int j=0; j<xs.length; j++)
				xs[j] = j;
			double[] ys = new double[xs.length];
			for (int j=0; j<xs.length; j++)
				ys[j] = slope*xs[j]+intercept + (j%2 == 0 ? 2:-2); 
			LinearRegression lr = new LinearRegression();
			for (int j=0; j < xs.length; ++j) {
				lr.accept(xs[j], ys[j]);
			}
			Assert.assertEquals(slope, lr.getSlope(), 0.1);
			Assert.assertEquals(intercept, lr.getIntercept(), 0.1);
		}
	}
	@Test
	public void testPredictions(){
		for (int i=1; i<100; i++) {
			double slope = i/10d*Math.random();
			double intercept = i+1;
			double[] xs = new double[100];
			for (int j=0; j<xs.length; j++)
				xs[j] = j;
			double[] ys = new double[xs.length];
			for (int j=0; j<xs.length; j++)
				ys[j] = slope*xs[j]+intercept; 
			LinearRegression lr = new LinearRegression();
			for (int j=0; j < xs.length; ++j) {
				lr.accept(xs[j], ys[j]);
			}
			for (int j=0; j<100; j++) {
				double x=j;
				double ans = j;
				ans = ans*lr.getSlope();
				ans = ans+lr.getIntercept();
				if (lr.getSlope() == 0)
					throw new IllegalArgumentException("This test won't pass until"
							+ " you implement getSlope()");
				Assert.assertEquals(ans, lr.predictY(x), 0.1);
			}
		}
	}

}
