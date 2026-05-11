import classes.Pessoa;
import classes.Funcionario;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*
    for(int i=0 ;i<20; i++){
        Pessoa p1 = new Pessoa();
        System.out.println("Digite o nome da " + (i+1) + "ª pessoa");
        p1.setNome(scan.next());

        System.out.println("Digite a sua idade");
        p1.setIdade(scan.nextInt());

        System.out.println("Digite o seu salario");
        p1.setSalario(scan.nextDouble());

        System.out.println(p1.imprimirDadosdePessoas());
        }
*/
        for (int i = 0; i<5; i++){
            Funcionario f1 = new Funcionario();
            System.out.println("Digite o nome da " + (i+1) + "ª pessoa");
            f1.setNome(scan.next());

            System.out.println("Digite a data (AAAA-MM-DD)");
            String dataString = scan.next();
            f1.setData(LocalDate.parse(dataString));


            System.out.println("Digite o seu salario: ");
            f1.setSalario(scan.nextDouble());

            if(f1.getSalario()>5000){
                System.out.println(f1.bonus());
            }else{
                System.out.println(f1.desconto());
            }
        }






    }
}