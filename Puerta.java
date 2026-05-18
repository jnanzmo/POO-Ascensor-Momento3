class Puerta {
    protected boolean abierta;

    public void abrir() {
        abierta = true;
        System.out.println("Puerta abierta");
    }

    public void cerrar() {
        abierta = false;
        System.out.println("Puerta cerrada");
    }
}
