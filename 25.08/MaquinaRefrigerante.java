public class MaquinaRefrigerante {
	
    // Atributos.
    private int preco;
    private int balanco;
    private int total;
    private boolean darTroco;

    // Método construtor para inicializar os atributos
    public MaquinaRefrigerante(int valor) {
        preco = valor;
        balanco = 0;
        total = 0;
        darTroco = false;
    }

    // Retorna o preço
    public int getPreco(){
        return preco;
    }

    // Retorna o balanço corrente
    public int getBalanco(){
        return balanco;
    }

    public void setTroco(boolean darTroco){
        this.darTroco = darTroco;
    }

    // Recebe um valor em dinheiro
    public void inserirDinheiro(int valor){
        if(valor < 0) {
            System.out.println("Por favor, insira um valor positivo!");
        }else{
            balanco += valor;
            System.out.println("Valor inserido com sucesso!!!!");
        }
    }

    public void comprarRefrigenrante(){
        if(balanco >= preco){
            System.out.println("##################");
            System.out.println("# Preco ##########");
            System.out.println("# Refrigerante");
            System.out.println("# R$ " + preco + ",00");
            System.out.println("##################");

            total = total + preco;

            balanco = balanco - preco;
            
            if(balanco > 0 && darTroco) System.out.println("Seu troco foi de: R$" + (devolverTroco()) + ",00");

        }else{
            System.out.println("Voce precisara inserir pelo menos: R$" + (preco - balanco) + ",00");
        }
    }

    public int devolverTroco(){
        int valorParaDevolver = balanco;
        balanco = 0;
        return valorParaDevolver;
    }    

    // Imprimir o preço do refrigerante
    public void imprimirPreco(){
        System.out.println("##################");
        System.out.println("# Preco ##########");
        System.out.println("# Refrigerante");
        System.out.println("# R$ " + preco + ",00");
        System.out.println("##################");
    }
}
