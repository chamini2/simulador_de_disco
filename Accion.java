public class Accion {

    private int bloque;
    private char tipo;

    public Accion(int bl, char ti) {
        this.bloque = bl;
        this.tipo = ti;
    }

    public int getBloque() {
        return this.bloque;
    }

    public char getTipo() {
        return this.tipo;
    }
}
