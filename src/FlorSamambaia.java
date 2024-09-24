import java.util.Scanner;

public class FlorSamambaia{

    public static String tentativaDesenhar(int r1, int x1, int y1, int r2, int x2, int y2){
        int distanciaX = x2 - x1;
        int distanciaY = y2 - y1;


        return "";

    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do círculo do caçador (r1): ");
        int r1 = scanner.nextInt();
        System.out.print("Digite a coordenada X do centro do círculo do caçador (x1): ");
        int x1 = scanner.nextInt();
        System.out.print("Digite a coordenada Y do centro do círculo do caçador (y1): ");
        int y1 = scanner.nextInt();

        System.out.print("Digite o raio do círculo da flor (r2): ");
        int r2 = scanner.nextInt();
        System.out.print("Digite a coordenada X do centro do círculo da flor (x2): ");
        int x2 = scanner.nextInt();
        System.out.print("Digite a coordenada Y do centro do círculo da flor (y2): ");
        int y2 = scanner.nextInt();

        // Chama o método com os valores do usuário e imprime o resultado
        String resultado = tentativaDesenhar(r1, x1, y1, r2, x2, y2);
        System.out.println(resultado);

        scanner.close(); 
        
    }
}