import classes.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    for(int i=0 ;i<20; i++){
        Pessoa p1 = new Pessoa();
        System.out.println("Digite o nome da " + (i+1) + "a pessoa");
        p1.setNome(scan.next());

        System.out.println("Digite a sua idade");
        p1.setIdade(scan.nextInt());

        System.out.println("Digite o seu salario");
        p1.setSalario(scan.nextDouble());

        System.out.println(p1.imprimirDadosdePessoas());

    }




    }
}