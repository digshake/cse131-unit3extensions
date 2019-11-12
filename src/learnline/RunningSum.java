package learnline;

/**
 * Maintain a running sum of values and a count of the number of values
 * 
 * @author 
 *
 */
public class RunningSum {
	
	//
	// Only these instance variables, no more!
	//
	
	private double sum;
	private int    count;
	
	public RunningSum() {
		this.sum   = 0.0;
		this.count = 0;
	}
	
	/**
	 * Incorporate the specified value into the sum, bumping the count by 1.
	 * @param value the next number to be added to the running sum
	 */
	public void add(double value) {
		// FIXME
	}
	
	/**
	 * Return the current count
	 * @return the number of values incorporated so far
	 */
	public int getCount() {
		return 0;  // FIXME
	}
	
	/**
	 * Return the sum of values seen so far
	 * @return the sum of values seen so far
	 */
	public double getSum() {
		return 0;  // FIXME
	}
	
	/**
	 * Compute and return the average of the values seen so far
	 * @return
	 */
	public double getAvg() {
		return 0;  // FIXME
	}

}
