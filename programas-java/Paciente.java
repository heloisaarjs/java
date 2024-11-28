/*Exercicio
 Implemente uma classe chamada "Paciente" que possua atributos para armazenar o nome, matrícula e remédios.
 */

import java.util.Scanner;
 public class Paciente{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do peciente: ");
        String nome = teclado.nextLine();
        System.out.println("Digite o numero da matricula: ");
        int matricula = teclado.nextInt();
        String remedio = "";
        while (true){
            System.out.println("Digite o nome do remédio: (0 p/ sair)");
            String input = teclado.nextLine();
            if (input.equals("0")){
                break;
            }
            remedio += input + "; ";
        }
        System.out.println("Nome do paciente: "+nome);
        System.out.println("Numero da matricula: "+matricula);
        System.out.println("Remedios: "+remedio);
        teclado.close();
    }
 }