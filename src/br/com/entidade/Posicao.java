package br.com.entidade;

/**
 *
 * @author William Bigas Mauro
 * @since 20/12/2018
 */
public class Posicao {

    private Integer x;
    private Integer y;

    public Posicao(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Caminho x:" + this.x + " / y: " + this.y;
    }
}
