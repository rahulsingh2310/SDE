import java.util.Scanner;
class Q2_Palindrome{
  public static void main(String args[]){

  Scanner input = new Scanner(System.in);
  System.out.print("Enter the Number: ");
  long num = input.nextLong();
  input.close();

	long temp;
	temp = num;

	long rem=0;
  long reverse;
  reverse=0;

  while(temp>0){
		rem = temp%10;
		reverse = reverse*10 + rem;
		temp = temp/10;
	 }

	if(reverse == num){
    System.out.println(num+" is a palindrome");
  }

	else{
    System.out.println(num+" is not a palindrome");
  }
    }
}
