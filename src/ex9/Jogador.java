package ex9;

public class Jogador {
    public String nomeJogador;
    public String posicaoJogador;
    public int anoNascimento;
    public int idade;
    public String nacionalidade;
    public double altura;
    public double peso;
    
    public Jogador(String nomeJogador, String posicaoJogador, int anoNascimento, String nacionalidade,
            double altura, double peso) {
        this.nomeJogador = nomeJogador;
        this.posicaoJogador = posicaoJogador;
        this.anoNascimento = anoNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }
     public void dadosJogador(){
        System.out.println("Nome: " + this.getNomeJogador());
        System.out.println("Posição: " + this.getPosicaoJogador());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
     }

    public void anosAposentar(){
        if (posicaoJogador == "Atacante" || posicaoJogador == "atacante"){
            int aposentar = 35 - getIdade();
            System.out.println("Anos em média até aposentadoria: " + aposentar);
        } else if (posicaoJogador == "Meio-campo" || posicaoJogador == "meio-campo" || 
        posicaoJogador == "Meio campo" || posicaoJogador == "meio campo"){
            int aposentar = 38 - idade;
            System.out.println("Anos em média até aposentadoria: " + aposentar);
        }else if (posicaoJogador == "Defesa" || posicaoJogador == "defesa"){
            int aposentar = 40 - idade;
            System.out.println("Anos em média até aposentadoria: " + aposentar);
        }
    }

    public String getNomeJogador() {
        return nomeJogador;
    }
    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }
    public String getPosicaoJogador() {
        return posicaoJogador;
    }
    public void setPosicaoJogador(String posicaoJogador) {
        this.posicaoJogador = posicaoJogador;
    }
    public int getIdade(){
        return 2022 - anoNascimento;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}


