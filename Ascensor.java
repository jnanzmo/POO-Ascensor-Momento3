class Ascensor {
    private PuertaAscensor puerta;
    private BotonAscensor[] botonascensor;
    private int pisoActual;

    public Ascensor(int cantidadPisos) {
        puerta = new PuertaAscensor();
        botonascensor = new BotonAscensor[cantidadPisos];
        pisoActual = 1;

        for (int i = 0; i < cantidadPisos; i++) {
            botonascensor[i] = new BotonAscensor(i + 1);
        }
    }

    public PuertaAscensor getPuerta() {
        return puerta;
    }

    public BotonAscensor getBoton(int i) {
        return botonascensor[i];
    }

    public void moverA(int pisoDestino) {

        if (pisoDestino > pisoActual) {
            System.out.println("Ascensor subiendo...");
        } else if (pisoDestino < pisoActual) {
            System.out.println("Ascensor bajando...");
        } else {
            System.out.println("El ascensor ya esta en el piso " + pisoActual);
            return;
        }

        System.out.println("Ascensor moviéndose...");

        pisoActual = pisoDestino;

        System.out.println("Llegaste al piso " + pisoActual);
        System.out.println("Ascensor detenido");
    }
}
