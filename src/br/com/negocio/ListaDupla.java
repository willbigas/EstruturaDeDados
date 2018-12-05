package br.com.negocio;

/**
 *
 * @author William Bigas Mauro
 * @since 20/12/2018
 */
public interface ListaDupla {

    public void adicionar(Object objeto);

    public void adicionar(Object objeto, Integer posicao);

    public Boolean remover(Integer posicao);

    public String inverso();

    public Boolean existe(Object objeto);

}
