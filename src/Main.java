public class Main {
    public static void main (String[] Args) {
        int stockInicial = 10;
        int unidadesVendidas = 3;
        int stockRestante = descontarStock(stockInicial, unidadesVendidas);

        System.out.println("Stock restante  = " + stockRestante);
    }

    static int descontarStock(int stock, int cantidad) {
        return stock - cantidad;
    }
}
