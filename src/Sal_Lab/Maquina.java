package Sal_Lab;

import Laboratorio.Sala;

public class Maquina extends Sala {

    public Maquina() {
        super();
    }

    public Maquina(int id_sala, int capacidad, int tiempo_uso, String[] carreras) {
        super(id_sala, capacidad, tiempo_uso, carreras);
    }

    @Override
    public int calcular_tiempo() {
        return 24 - getTiempoUso();
    }
}
