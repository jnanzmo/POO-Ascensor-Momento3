public class Main {

    public static void main(String[] args) {

        Object objAscensor = new Ascensor(4);
        Ascensor ascensor = (Ascensor) objAscensor;

        Object objPiso1 = new Piso(1);
        Object objPiso2 = new Piso(2);
        Object objPiso3 = new Piso(3);
        Object objPiso4 = new Piso(4);

        Piso piso1 = (Piso) objPiso1;
        Piso piso2 = (Piso) objPiso2;
        Piso piso3 = (Piso) objPiso3;
        Piso piso4 = (Piso) objPiso4;

        Object[] pisos = new Object[4];
        pisos[0] = piso1;
        pisos[1] = piso2;
        pisos[2] = piso3;
        pisos[3] = piso4;

        // 1. Llamar ascensor
        piso1.llamarAscensor(ascensor);

        // 2. Presionar botón (piso 3)
        BotonAscensor boton = (BotonAscensor) ascensor.getBoton(2);
        boton.presionar();

        // 3. Movimiento
        ascensor.moverA(boton.getPisoDestino());

        // 4. Puerta
        PuertaAscensor puerta = ascensor.getPuerta();
        puerta.abrir();
        puerta.cerrar();
    }
}
