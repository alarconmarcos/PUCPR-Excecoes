public class Exemplo {
    static int realizarConta(int x, int y) {
        return y / x;
    }
        
    public static void main(String[] args) {
        try {
            int z = realizarConta(2, 10);
            if (z == 5) return;
            
            System.out.println(z);
            
            String x = null;
            System.out.println(x.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Sempre executado!");
        }
        System.out.println("FIM");
    }
}

