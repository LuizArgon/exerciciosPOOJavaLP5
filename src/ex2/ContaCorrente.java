package ex2;

public class ContaCorrente {
    public int numeroConta;
    private String nomeCorrentista;
    private float saldoConta;

    public ContaCorrente(){
        this.numeroConta = 52298650;
        this.nomeCorrentista = "Luiz Henrique";
        this.saldoConta = 0;
    }

    public void mostrarConta(){
        System.out.println("Numero da conta: " + this.getNumeroConta());
        System.out.println("Nome: " + this.getNomeCorrentista());
        System.out.println("Saldo: " + this.getSaldoConta());
    }

    public void alterarNome(String novoNome){
        this.setNomeCorrentista(novoNome);
        System.out.println("\nO novo nome do correntista é: " + nomeCorrentista);
    }

    public void depositar(float deposito){
        this.setSaldoConta(this.getSaldoConta() + deposito);
        System.out.println("\nO novo saldo da conta é: " + this.getSaldoConta());
    }

    public void sacar(float saque){
        if(this.getSaldoConta() >= saque){
            this.setSaldoConta(this.getSaldoConta() - saque);
            System.out.println("\nO novo saldo da conta é: " + this.getSaldoConta());  
        } else {
            System.out.println("\nSem saldo para este saque.");
        }

        
    }
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

}
