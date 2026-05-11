package classes;
import java.time.LocalDate;
public class Funcionario {
    private String nome;
    private double salario;
    private LocalDate data;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double bonus(){

            salario = getSalario() * 1.05;

        return salario;
    }

    public double desconto(){
        salario = getSalario() * 0.97;

        return salario;
    }

}
