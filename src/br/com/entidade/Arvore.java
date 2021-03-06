package br.com.entidade;

/**
 * Classe com Entidade arvore para implementacao de Busca Binaria
 *
 * @author William Bigas Mauro
 * @since 28/11/2018
 */
public class Arvore {

    private Integer informacao;
    private Arvore esquerda;
    private Arvore direita;

    public Arvore() {
        this.informacao = null;
        this.direita = null;
        this.esquerda = null;
    }

    public Arvore(Integer info) {
        this.informacao = info;
        this.esquerda = null;
        this.direita = null;
    }

    public Integer getInformacao() {
        return informacao;
    }

    public void setInformacao(Integer informacao) {
        this.informacao = informacao;
    }

    public Arvore getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Arvore esquerda) {
        this.esquerda = esquerda;
    }

    public Arvore getDireita() {
        return direita;
    }

    public void setDireita(Arvore direita) {
        this.direita = direita;
    }

    public boolean isVazio() {
        if (this.informacao == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adicionar(Integer info) {
        if (isVazio()) {
            setInformacao(info);
        } else {
            if (info < getInformacao()) {
                if (getEsquerda() == null) {
                    Arvore novo = new Arvore(info);
                    setEsquerda(novo);
                } else {
                    Arvore arvoreEsquerda = getEsquerda();
                    arvoreEsquerda.adicionar(info);
                }
            }
            if (info > getInformacao()) {
                if (getDireita() == null) {
                    Arvore novo = new Arvore(info);
                    setDireita(novo);
                } else {
                    Arvore arvoreDireita = getDireita();
                    arvoreDireita.adicionar(info);
                }
            }

        }
    }

    public boolean existe(int num) {

        if (num == this.getInformacao()) {
            return true;
        } else if (num < this.getInformacao()) {

            if (this.getEsquerda() == null) {
                return false;
            } else {
                return this.getEsquerda().existe(num);
            }

        } else if (num > this.getInformacao()) {

            if (this.getDireita() == null) {
                return false;
            } else {
                return this.getDireita().existe(num);
            }

        }

        return false;

    }

    @Override
    public String toString() {
        return "Arvore{" + "informacao=" + informacao + ", esquerda=" + esquerda + ", direita=" + direita + '}';
    }

    public void imprimirPreOrdem() {
        if (!isVazio()) {
            System.out.println(getInformacao());
        }
        if (getEsquerda() != null) {
            Arvore ae = getEsquerda();
            ae.imprimirPreOrdem();
        }

        if (getDireita() != null) {
            getDireita().imprimirPreOrdem();
        }
    }

}
