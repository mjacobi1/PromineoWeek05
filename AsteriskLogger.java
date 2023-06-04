package week5;

public class AsteriskLogger implements Logger {

	public void Log(String log) {
		String completedAsterisk = "***" + log + "***";
		System.out.println(completedAsterisk);
	}
	
	public void Error(String error) {
		String completedError = ("***" + "Error: " + error + "***");
		System.out.println("****************");
		System.out.println(completedError);
		System.out.println("****************");
	}
}
