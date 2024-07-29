/*
Third practice project for Learn Java at Codecademy by Audrey Johnson in July 2024.
This one practices applying arithmetic operations on an integer. 
*/

public class Magic {
	public static void main(String[] args) {
    int myNumber = 77;
		//myNumber is the original number

    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    System.out.println(stepSix);
	}
}
