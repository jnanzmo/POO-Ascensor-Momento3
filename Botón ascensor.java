class BotonAscensor extends Boton {
    private int pisoDestino;

    public BotonAscensor(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }

    public int getPisoDestino() {
        return pisoDestino;
    }

    public void presionar() {
        estado = true;
        System.out.println("Ir al piso " + pisoDestino);
    }
}
