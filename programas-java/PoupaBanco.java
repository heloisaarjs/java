import java.util.Scanner;
public class PoupaBanco {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
         System.out.print("Digite o nome do cliente: ");
            String nomeCli = teclado.nextLine();
            System.out.print("Digite o numero da conta: ");
            int nConta = teclado.nextInt();
            System.out.print("Digite o saldo total no momento:R$ ");
            float nSaldo = teclado.nextFloat();
            System.out.print("Voce deseja realizar 1-saque ou 2-deposito? ");
             float valUsua = teclado.nextInt();
             System.out.print("Digite o valor:R$ ");
                float valor = teclado.nextFloat();
            if (valUsua == 1){
                float saq = nSaldo - valor;
                System.out.println("Saldo apos o saque:R$ "+saq);
                
            }
            else{
                float dep = nSaldo + valor;
                System.out.println("Saldo apos o deposito:R$ "+dep);
                
            }
             System.out.println("Saldo antigo:R$ "+nSaldo);
             System.out.println("Nome do Cliente: "+nomeCli);
            System.out.println("Numero da conta: "+nConta);
            
           
            
        }
    }
     

