package ex3;


public class BombaCombustivel{
    public String tipoCombustivel = "alcool";
    public double totalCombustivel = 100;
    public double valorLitro = 7.50;
    public double quantCombustivel;
    public double valorPagar;

    public BombaCombustivel(){
        this.setTipoCombustivel("Alcool");
        this.setTotalCombustivel(100);
        this.setValorLitro(7.50);    
    }

    public void mostrarBomba(){
        System.out.println("\nTipo do combustivel " + this.getTipoCombustivel());
        System.out.println("Total na bomba: " + this.getTotalCombustivel());
        System.out.println("Valor por litro: " + this.getValorLitro());
    }

    public void abastecerPorValor(double valor){ 
        quantCombustivel = (valor/valorLitro);
        if(this.getTotalCombustivel() >= quantCombustivel){
            this.setTotalCombustivel(this.getTotalCombustivel() - quantCombustivel);
            System.out.println("\nQuantia abastecida: " + quantCombustivel);
            System.out.println("Combustivel restante: " + totalCombustivel);
        } else {
            System.out.println("\nSem combustivel suficiente!");
        }
    }
    
    public void abastecerPorLitro(float quantCombustivel){ 
        if (this.getTotalCombustivel() >= quantCombustivel){
            this.setTotalCombustivel(this.getTotalCombustivel() - quantCombustivel);
            valorPagar = (quantCombustivel*valorLitro);
            System.out.println("\nValor a ser pago: " + valorPagar);
            System.out.println("Combustivel restante: " + totalCombustivel);
        }
    }

    public void alterarValor(float novoValorLitro){ 
        this.setValorLitro(novoValorLitro);
        System.out.println("\nNovo valor do litro: " + this.getValorLitro());
    }

    public void alterarCombustivel(String novoTipoCombustivel){ 
        this.setTipoCombustivel(novoTipoCombustivel);
        System.out.println("\nNovo tipo de combustivel: " + this.getTipoCombustivel());
        }

    public void alterarQuantidadeCombustivel(double novoTotalCombustivel){ 
        this.setTotalCombustivel(novoTotalCombustivel);
        System.out.println("\nTotal na bomba: " + this.getTotalCombustivel());
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getTotalCombustivel() {
        return totalCombustivel;
    }

    public void setTotalCombustivel(double totalCombustivel) {
        this.totalCombustivel = totalCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public double getQuantCombustivel() {
        return quantCombustivel;
    }

    public void setQuantCombustivel(double quantCombustivel) {
        this.quantCombustivel = quantCombustivel;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }   
      
}
    

