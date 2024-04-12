package Canciones;

import GestionDispositivosMultimedia.ProcesadorInvalidoException;

public class Ordenador extends DispositivoMultimedia {
    private String modeloProcesador;

    public Ordenador(String marca, String modelo, double precio, String modeloProcesador) throws ProcesadorInvalidoException {
        super(marca, modelo, precio);
        if (modeloProcesador == null || modeloProcesador.isEmpty())
            throw new ProcesadorInvalidoException("El modelo de procesador no puede estar vacío.");
        this.modeloProcesador = modeloProcesador;
    }

    public String getModeloProcesador() {
        return modeloProcesador;
    }

    public void setModeloProcesador(String modeloProcesador) {
        this.modeloProcesador = modeloProcesador;
    }

    public String toString() {
        return super.toString() ;
    }

    public void mostrarInformacion() {
        System.out.println("+----------------------------------------+");
        System.out.println("| Ordenador                              |");
        System.out.println("+----------------------------------------+");
        super.mostrarInformacion();
        System.out.println("| Procesador: " + modeloProcesador);
        System.out.println("+----------------------------------------+");
    }
}
