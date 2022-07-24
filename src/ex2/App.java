package ex2;

public class App {
    
    public static void main(String[] args){
        ContaCorrente cliente1 = new ContaCorrente();
        cliente1.mostrarConta();
        cliente1.depositar(250);
        cliente1.sacar(200);
        cliente1.alterarNome("Luiz Henrique Bottega");
        cliente1.sacar(100);
    }
}
