package week3;

public class week3 {

public static void main(String[] args) {
int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 20};
int lastItem = ages[ages.length - 1];
int subtraction = (ages [0] - lastItem);
	System.out.println(subtraction); 
	
	String[] names = {"sam","Tommy","Tim","Sally","Buck","Bob"};
	int totalLength =0;	
	for(int i = 0; i < names.length; i++) {
		totalLength = totalLength + names[i].length();
		System.out.println(names[i] + " ");
		System.out.println(totalLength);
	}
int avgNumberOfLetters = totalLength / names.length;
System.out.println(avgNumberOfLetters);
var resultString = " ";
for(var i = 0; i < names.length; i++) {
	resultString += names[i] + ", ";
	resultString += names[names.length-1];
System.out.println(resultString);
}
	System.out.println("=================== that one wouldnt go correctly");
	int[] nameLengths; 
	int nameLength =0;	
	for(int i = 0; i < names.length; i++) {
		nameLength = nameLength + names[i].length();
		System.out.println(names[i] + " ");
		System.out.println(totalLength);
	}
	System.out.println("my understanding of questions 5 & 6 is saying figure out how many characters are in the names array, then to print the amount of characters there are");				
String greet = "Hello";
 System.out.println(greet.repeat(3));

String firstName = "Nick";
String lastName = "Onate";
String fullName = fullName(firstName, lastName); 
System.out.println(fullName);
System.out.println();
double[] doubles = {17.7, 90.2, 60.3};
System.out.println(calculateAvg(doubles));

}
public static String fullName(String firstName, String lastName) {
	return firstName + " " + lastName;
	}
//public static boolean trueSum (int[] number) {
	
//}
public static double calculateAvg(double[] array) {
	double sum = 0;
	for(double number : array ) {
		sum += number;
	}
	return sum / array.length;

	}


	
	
	
}