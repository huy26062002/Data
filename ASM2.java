import java.util.Scanner;

public class ASM2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Messager P1 = new Messager("P1");
		Messager P2 = new Messager("P2");
		
		try {
			P1.connect(P2);
			System.out.println("People 1 sent: ");
			while (true) {
				String sentence = scanner.nextLine();
				if (sentence.isEmpty())
				 	break;
				else if (sentence.length() > 250){
					System.out.print("\nMax limit can't send the message. Please delete and input again!");
				}else 
			 	P1.send(sentence);
			 }
			
			P2.receive();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		scanner.close();
		
		P2.printAll();
		
	}

}


