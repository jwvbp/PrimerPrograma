import ar.edu.unlu.poo.lista.Nodo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello " + i);
        }

        Nodo miNodo = new Nodo();
        miNodo.setDato("Hola Mundo");
        System.out.println(miNodo.getDato());

     }

}
