

    public class testeImpressora {
        public static void main(String[] args) {
            
            impressora Imprimir = new impressora();
    
            Imprimir.exibir(2.00f);
            Imprimir.exibir(3.00f, 4.00f);
            Imprimir.exibir(5.00f, "a");
            Imprimir.exibir("a", 2.01f);
            Imprimir.exibir("Ola", "Bianca", "Teste");
            Imprimir.exibir("a", "b","c");
        }
    }
    
