public class MaquinaRefrigeranteView {
    public static void main(String[] args){
        MaquinaRefrigerante mr = new MaquinaRefrigerante(7);
        
        mr.imprimirPreco();
        System.out.println();
        
        mr.inserirDinheiro(20);
        System.out.println("Balanco: R$" + mr.getBalanco() + ",00");
        System.out.println();

        mr.comprarRefrigenrante();
        System.out.println("Balanco: R$" + mr.getBalanco() + ",00");
        System.out.println();
        
        mr.setTroco(true);
        mr.comprarRefrigenrante();
        System.out.println("Balanco: R$" + mr.getBalanco() + ",00");
        System.out.println();

        mr.imprimirMovimentoDia();

    }
}