/*3 - Escreva um código onde seja possível calcular a área de uma figura
        geométrica, todas devem ter um método que retorne esse valor,
        as formas geométricas disponiveis devem ser as seguintes:

        Quadrado: possui o valor dos seus lados;
        Retângulo: possui os valores de base e altura;
        Circulor: possui o atributo raio.
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        var quadrado = new Quadrado();
        var circulo = new Circulo();
        var triangulo = new Triangulo();

        var scanner = new Scanner(System.in);

        String menu = "Figuras geométricas\n" +
                "1 - Quadrado\n" +
                "2 - Círculo\n" +
                "3 - Triângulo\n" +
                "0 - Sair\n\n";

        while(true)
        {

            System.out.println(menu);

            int options = Integer.parseInt(scanner.nextLine());

            if (options == 1)
            {
                System.out.println("Digite a base do quadrado: ");
                quadrado.setBase(Integer.parseInt(scanner.nextLine()));
                System.out.println("Digite a altura do quadrado: ");
                quadrado.setAltura(Integer.parseInt(scanner.nextLine()));
                System.out.println("Área do quadrado: " + quadrado.valorArea());

            } else if (options == 2)
            {

                System.out.println("Digite o raio do círculo: ");
                circulo.setRaio(Integer.parseInt(scanner.nextLine()));

                System.out.println("Área do círculo: " + circulo.valorArea());


            } else if (options == 3)
            {

                System.out.println("Digite a base do triangulo: " );
                triangulo.setBase(Integer.parseInt(scanner.nextLine()));

                System.out.println("Digite a altura do triangulo: ");
                triangulo.setAltura(Integer.parseInt(scanner.nextLine()));

                System.out.println("Área do triângulo: " + triangulo.valorArea());

            } else if (options == 0)
            {

                break;

            }else
            {

                System.out.println("Opção inválida.\n");

            }
        }
    }
}