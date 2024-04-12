package Canciones;

import GestionDispositivosMultimedia.CamaraInvalidaException;

public class Telefono extends DispositivoMultimedia {
    private int megapixelesCamara;

    public Telefono(String marca, String modelo, double precio, int megapixelesCamara) throws CamaraInvalidaException {
        super(marca, modelo, precio);
        if (megapixelesCamara < 0)
            throw new CamaraInvalidaException("Los megapíxeles de la cámara no pueden ser negativos.");
        this.megapixelesCamara = megapixelesCamara;
    }

    public int getMegapixelesCamara() {
        return megapixelesCamara;
    }

    public void setMegapixelesCamara(int megapixelesCamara) {
        this.megapixelesCamara = megapixelesCamara;
    }

    public String toString() {
        return super.toString();
    }

    public void mostrarInformacion() {
        System.out.println("+----------------------------------------+");
        System.out.println("| Teléfono                               |");
        System.out.println("+----------------------------------------+");
        super.mostrarInformacion();
        System.out.println("| Cámara: " + megapixelesCamara + " MPx.");
        System.out.println("+----------------------------------------+");
    }
}
