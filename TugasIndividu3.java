import java.util.Scanner;
public class TugasIndividu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (min.3): ");
        int N = scanner.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus (min.3)");
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(N + " ");
            }
            System.out.println();
        }

        scanner.close();
    
}

    }
  
