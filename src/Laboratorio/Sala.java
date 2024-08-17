package Laboratorio;

public abstract class Sala {
    private int id_sala;
    private int capacidad;
    private String[] carr_est;
    private int tiempo_uso;

    public Sala() {
        this.id_sala = 0;
        this.capacidad = 0;
        this.tiempo_uso = 0;
        this.carr_est = new String[0];
    }

    public Sala(int id_sala, int capacidad, int tiempo_uso, String[] carreras) {
        this.id_sala = id_sala;
        this.capacidad = capacidad;
        this.tiempo_uso = tiempo_uso;
        this.carr_est = carreras;
    }

    public int getIdSala() {
        return id_sala;
    }

    public void setIdSala(int id_sala) {
        this.id_sala = id_sala;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getTiempoUso() {
        return tiempo_uso;
    }

    public void setTiempoUso(int tiempo_uso) {
        this.tiempo_uso = tiempo_uso;
    }

    public String getCarrEst(int index) {
        if (index >= 0 && index < carr_est.length) {
            return carr_est[index];
        }
        return null;
    }

    public void setCarrEst(int index, String carrera) {
        if (index >= 0 && index < carr_est.length) {
            this.carr_est[index] = carrera;
        }
    }

    public void setTamCarrEst(int tam) {
        this.carr_est = new String[tam];
    }

    public abstract int calcular_tiempo();
}