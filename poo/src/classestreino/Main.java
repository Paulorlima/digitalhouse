package classestreino;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Joana", 3, "2");
        Pessoa p3 = new Pessoa("Carlos", 39, "3", 89.3,1.75);
        
        if(p3.ehMaioridade())
            System.out.print(p3.getNome() + " é maior de idade");

        else
            System.out.print(p3.getNome() + " é menor de idade");

        if(p3.calcularIMC()==-1)
            System.out.println(" e esta abaixo do peso");

        else if(p3.calcularIMC()==0)
            System.out.println(" e esta com o peso saudável");

        else if(p3.calcularIMC()==1)
            System.out.println(" e esta com sobrepeso");
    }
}
