class Piso {
    private int numero;
    private PuertaPiso puerta;
    private BotonPiso boton;

    public Piso(int numero) {
        this.numero = numero;
        puerta = new PuertaPiso();
        boton = new BotonPiso();
    }

    public boolean llamarAscensor(Ascensor ascensor) {
        System.out.println("Piso " + numero + " llama al ascensor");
        boton.presionar();
        return true;
    }
}
