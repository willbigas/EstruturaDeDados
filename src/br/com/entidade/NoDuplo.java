package br.com.entidade;

/**
 *
 * @author William Bigas Mauro
 * @since 20/12/2018
 */
public class NoDuplo {

    private Object elemento;
    private NoDuplo proximo;
    private NoDuplo anterior;

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public NoDuplo getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }

    public NoDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }

}
