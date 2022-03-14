package heranca;

public class Pereciveis extends Produto{
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        if(diasParaVencer==1){
            return (getPreco()*quantidadeDeProdutos)/4;
        }else if(diasParaVencer==2){
            return (getPreco()*quantidadeDeProdutos)/3;
        }else if(diasParaVencer==3){
            return (getPreco()*quantidadeDeProdutos)/2;
        }else{
            return 0;
        }
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }
}
