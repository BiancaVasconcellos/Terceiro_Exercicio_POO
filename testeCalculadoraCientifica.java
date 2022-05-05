public class testeCalculadoraCientifica {
    public static void main(String[] args) {
      

       calculadoraCientifica Calcular = new calculadoraCientifica();

       System.out.println(Calcular.raiz(12));
       System.out.println(Calcular.raiz(120f));
       System.out.println(Calcular.raiz("12"));
       System.out.println(Calcular.potência(2, 1));
       System.out.println(Calcular.potência(1, 2));
       System.out.println(Calcular.potência(1, 2f));
    }
}
