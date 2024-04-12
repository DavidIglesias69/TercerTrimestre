package Canciones;

import GestionDispositivosMultimedia.PantallaInvalidaException;

public class Tablet extends DispositivoMultimedia {
    private double pulgadasPantalla;

    public Tablet(String marca, String modelo, double precio, double pulgadasPantalla) throws PantallaInvalidaException {
        super(marca, modelo, precio);
        if (pulgadasPantalla <= 0)
            throw new PantallaInvalidaException("El tamaño de la pantalla debe ser positivo.");
        this.pulgadasPantalla = pulgadasPantalla;
    }

    public double getPulgadasPantalla() {
        return pulgadasPantalla;
    }

    public void setPulgadasPantalla(double pulgadasPantalla) {
        this.pulgadasPantalla = pulgadasPantalla;
    }

    public String toString() {
        return super.toString();
    }

    public void mostrarInformacion() {
        System.out.println("+----------------------------------------+");
        System.out.println("| Tablet                                 |");
        System.out.println("+----------------------------------------+");
        super.mostrarInformacion();
        System.out.println("| Pantalla: " + pulgadasPantalla + " pulgadas.");
        System.out.println("+----------------------------------------+");
    }
}
