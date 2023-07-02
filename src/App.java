
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int X;
		int calculo;
		while ((X = sc.nextInt()) != 0) {
			if (X % 2 != 0) {
				X++;
			}
			calculo = X;
			for (int i = 0; i < 4; i++) {
					X += 2;
					calculo += X;
			}
			System.out.println(calculo);
		}
		sc.close();
	}
}
    

