package br.com.negocio;

/**
 *
 * @author William Bigas Mauro
 * @since 20/12/2018
 */
public interface Fila {

    public void adicionar(Object objeto);

    public Object remover();

    public Integer tamanho();

    public Boolean isVazia();
}
