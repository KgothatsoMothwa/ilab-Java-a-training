package Chapter6;

public class DebugExercise5 {
	public static void main(String[] args) {
		System.out.println("Average Calculator");
		double avg = calcAverage(1, 2, 3);
		System.out.println("The average is: " + avg);
	}

	public static double calcAverage(double... numbers) {
		double results = 0;


		if (numbers.length == 0) {
			return 0;
		}

		for (double n : numbers) {
			results += n;
		}
		return results / numbers.length; // Correctly calculate the average**/
	}
}
