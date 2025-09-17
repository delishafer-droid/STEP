import java.util.Scanner;
public class AmarAkbarAnthony{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int i=1;

	System.out.print("Enter age of Amar: ");
    int ageAmar = input.nextInt();
    System.out.print("Enter height of Amar: ");
    int heightAmar = input.nextInt();

    System.out.print("Enter age of Akbar: ");
    int ageAkbar = input.nextInt();
    System.out.print("Enter height of Akbar: ");
    int heightAkbar = input.nextInt();

    System.out.print("Enter age of Anthony: ");
    int ageAnthony = input.nextInt();
    System.out.print("Enter height of Anthony: ");
    int heightAnthony = input.nextInt();
	
	if(ageAmar<ageAkbar && ageAmar<ageAnthony){
		System.out.print("Amar is the youngest ");
	}else if(ageAkbar<ageAmar && ageAkbar<ageAnthony){
		System.out.print("Akbar is the youngest ");
	}else if(ageAnthony<ageAkbar && ageAnthony<ageAmar){
		System.out.print("Anthony is the youngest ");
	}

	if(heightAmar>heightAkbar && heightAmar>heightAnthony){
		System.out.print("Amar is the tallest ");
	}else if(heightAkbar>heightAmar && heightAkbar>heightAnthony){
		System.out.print("Akbar is the tallest ");
	}else if(heightAnthony>heightAkbar && heightAnthony>heightAmar){
		System.out.print("Anthony is the tallest ");
	}
}
}

