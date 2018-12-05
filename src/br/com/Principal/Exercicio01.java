/**
 * Exercicio 01 - Crie uma lista duplamente encadeada e execute os comandos:
 *
 * a. Adicione “João”
 * b. Adicione “Maria”
 * c. Adicione “Paula”
 * d. Adicione “Pedro”
 * e. Remova o primeiro elemento
 * f. Adicione “José”
 * g. Remova o primeiro elemento
 * h. Adicione “João”
 * i. Adicione “Marcelo”
 * j. Adicione “Maria” na primeira posição
 * Imprima os elementos da lista do início ao fim. Verifique se o resultado é o esperado:
 * “Maria, Paula, Pedro, José, João, Marcelo”
 * Imprima os elementos na ordem inversa. Verifique se o resultado é o esperado:
 * “Marcelo, João, José, Pedro, Paula, Maria”
 */
package br.com.Principal;

import entidadeImpl.ListaDuplamenteEncadeada;

/**
 *
 * @author William Bigas Mauro
 * @since 20/11/2018
 */
public class Exercicio01 {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
        l.adicionar("João");
        System.out.println("João Adicionado - " + l);
        l.adicionar("Maria");
        System.out.println("Maria Adicionada - " + l);
        l.adicionar("Paula");
        System.out.println("Paula Adicionada - " + l);
        l.adicionar("Pedro");
        System.out.println("Pedro Adicionado - " + l);
        l.remover(1);
        System.out.println("Depois de remover o Primeiro - " + l);
        l.adicionar("José");
        System.out.println("José Adicionado - " + l);
        l.remover(1);
        System.out.println("Depois de remover o primeiro novamente. - " + l);
        l.adicionar("João");
        System.out.println("João Adicionado - " + l);
        l.adicionar("Marcelo");
        System.out.println("Marcelo Adicionado - " + l);
        l.adicionar("Maria", 1);
        System.out.println("Maria Adicionada - " + l);

        System.out.println(l);
        System.out.println(l.inverso());
    }
}
