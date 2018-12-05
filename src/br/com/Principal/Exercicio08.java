/**
 * 1. Crie a classe árvore (que representa uma árvore binária que armazena números
 * inteiros). Implemente os métodos adicionar e existe. 
 * O método existe deve retornar verdadeiro ou falso, 
 * conforme a existência do elemento na árvore.
 */
package br.com.Principal;

import br.com.entidade.Arvore;

/**
 *
 * @author William Bigas Mauro
 * @since 28/11/2018
 */
public class Exercicio08 {

    public static void main(String[] args) {

        Arvore a = new Arvore();
        a.adicionar(1);
        a.adicionar(3);
        a.adicionar(5);
        a.adicionar(7);

        System.out.println(a);

        if (a.existe(1)) {
            System.out.println("Numero Existe");
        } else {
            System.out.println("Não existe");
        }

        a.imprimirPreOrdem();

    }

}
