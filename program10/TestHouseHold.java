package program10;

public class TestHouseHold {

	public static void main(String[] args) {
		HouseHold test = new HouseHold();
		test.openFile();
		test.readRecords();
		test.createFile();
		test.calculIncome();
		test.aboveAver();
		test.povertyLevel();
		test.closeFile();
		

	}

}
