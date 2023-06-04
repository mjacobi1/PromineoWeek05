package week5;

public class SpacedLogger implements Logger {
	

	public void Log(String log) {
		String completedSpaces = log.replaceAll(".(?=.)", "$0 ");
//		String completedSpaces = "";
//		for (int i = 0; i < log.length(); i++) {
//			completedSpaces = log.charAt(i) + " ";
//		}
		System.out.println(completedSpaces);
	}


	public void Error(String error) {
		String completedError = error.replaceAll(".(?=.)", "$0 ");
		System.out.println("ERROR: " + completedError); 
	}

}
