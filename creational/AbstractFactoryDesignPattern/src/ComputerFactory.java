import abstractClasses.Computer;
import interfaces.ComputerAbstractFactory;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}