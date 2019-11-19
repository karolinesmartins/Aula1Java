public class Main {
    public static void main (String[] args){
       System.out.println("Hello World!!");

       int numero = 1;
       System.out.println(numero);

       String nome = "Jessica";
       System.out.println(nome + " " + numero);

       System.out.println(soma(10,20));

    }
    public static int soma(int numeroA, int numeroB) {
        return numeroA + numeroB;
    }
}
