public class Aluno{
    private Prova prova1;
    private Prova prova2;

    public Aluno(Prova prova1, Prova prova2){
        this.prova1 = prova1;
        this.prova2 = prova2;
    }

    public double calcularMedia(){
        double media = (prova1.calcularNotaTotal() + prova2.calcularNotaTotal()) / 2.0;

        return media;
    }
}