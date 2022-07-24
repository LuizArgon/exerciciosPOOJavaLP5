package ex5;

public class App{
    public static void main(String[] args){
        double notaFinal = 0;

        media objetoMedia = new media();

        objetoMedia.matricula = 0001;
        objetoMedia.nome = "Luiz H";
        objetoMedia.nota1 = 70;
        objetoMedia.nota2 = 75;
        objetoMedia.notaTrabalho = 60;

        float mediaTeste = objetoMedia.calcularMedia();

        System.out.println("A média foi: " + mediaTeste);

        if (mediaTeste < 70){
            notaFinal = 140 - mediaTeste;
            System.out.println("A nota necessária no exame para passar é: "+ notaFinal);
        }
    }
}