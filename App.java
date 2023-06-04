package week5;

public class App{
public static void main(String[] args) {
	Logger plsWork = new AsteriskLogger();
	plsWork.Log("Testing");
	plsWork.Error("Example");
	

	Logger secondTry = new SpacedLogger();
	secondTry.Log("Testing");
	secondTry.Error("Example");
	}
}