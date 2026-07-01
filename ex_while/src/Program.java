import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String login;
		int senha ;
		System.out.println("Login : ");
		login =sc.nextLine();
		System.out.println("Senha : ");
		senha = sc.nextInt();
		while (senha != 1234) {
			System.out.println("Senha incorreta ");
			System.out.println();
			System.out.println("Informe a senha : ");
			senha = sc.nextInt();
			if (senha ==1234) {
				System.out.println("Acesso liberado ");
			}
			
			}
		
		sc.close();
	}

}
