public class Prova{
    private double notaParte1;
    private double notaParte2;

    public Prova(double notaParte1, double notaParte2){
        this.notaParte1 = notaParte1;
        this.notaParte2 = notaParte2;
    }

    public double calcularNotaTotal(){
        double total;
        if(notaParte1 + notaParte2 > 10) total = 10;
        else total = notaParte1 + notaParte2;

        return total;
    }
}