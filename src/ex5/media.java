package ex5;

public class media{
    public int matricula;
    public String nome;
    public double nota1;
    public double nota2;
    public double notaTrabalho;
    public double media;

    public float calcularMedia(){
        double media = (((nota1*2.5)+(nota2*2.5)+(notaTrabalho*2))/7);
        return (float) media;
    }
}