package br.com.negocio;

/**
 *
 * @author William Bigas Mauro
 * @since 20/12/2018
 */
public interface Pilha {

    public void empilhar(Object objeto);

    public Object desempilhar();

    public Integer tamanho();

    public Boolean isVazia();
}
