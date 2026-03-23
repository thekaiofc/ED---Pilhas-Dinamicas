package view;

import model.Pilha;

public class Main {
    public static void main(String[] args) {

        Pilha p = new Pilha();
        boolean vazia = p.isEmpty();
        System.out.println("Vazia? " + vazia);

       int totalNos = (int) ((Math.random() * 10 + 1));
       for  (int i = 0; i <= totalNos; i++) { //empilha
           int e = (int) ((Math.random() * 10 + 1));
           p.push(e);
       }

        int top = 0;
        try {
            top = p.top();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Top no: " + top);

        for  (int i = 0; i <= totalNos; i++){ //desempilha
            try {
                int valor = p.pop();
                System.out.println("Pop: " + valor);
            } catch (Exception e) {
                e.printStackTrace();
            }
            vazia = p.isEmpty();
            System.out.println("Vazia? " + vazia);
        }
        try {
            p.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}