import java.util.Scanner;

public class Main{
	private static final Scanner cin = new Scanner(System.in);
	public static void main(String[] args){
		int n, biggestIndex = 0;

		System.out.print("Please enter how many elements do you want to have: ");
		n = cin.nextInt();


		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++){
			try {
				insertElement(arr,i);
			} catch(NonPositiveElement nne){
				System.out.println(nne.getMessage());
				i--;
			} catch(Exception e){
				System.out.println("??? what did you do???");
				System.out.println(e.getMessage());
			}
		}

		for (int i = 1; i < n; i++)
			if (arr[i] > arr[biggestIndex])
				biggestIndex = i;

		System.out.printf("The biggest number in the array was: %d\n", arr[biggestIndex]);
	}

	public static void insertElement(int[] arr, int index) throws NonPositiveElement{
		arr[index] = cin.nextInt();
		if (arr[index] < 0)
			throw new NonPositiveElement();
	}
}

class NonPositiveElement extends Exception {
	NonPositiveElement(String message){
		super(message);
	}

	NonPositiveElement(){
		super("The inserted element was negative, please try again");
	}
}
