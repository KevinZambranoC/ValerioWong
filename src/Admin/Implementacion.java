package Admin;

import Sal_Lab.Maquina;

public class Implementacion {

    private String[] informacion = {
        "1 15 Informatica-Mecanica-Electronica 7",
        "2 18 Mecanica-Agronomia-IPA-Industrial 5",
        "3 17 Informatica-Electronica-Electromedicina-Salud 9",
        "4 20 Medicina-Paleontologia-Enfermeria 6",
        "5 19 Historia-Biologia-Matematicas 4" 
    };

    private Maquina[] maquinas;

    public Implementacion() {
        maquinas = new Maquina[informacion.length];
        cargar();
    }

    public void cargar() {
        for (int i = 0; i < informacion.length; i++) {
            String[] datos = informacion[i].split(" ");
            int id = Integer.parseInt(datos[0]);
            int capacidad = Integer.parseInt(datos[1]);
            String[] carreras = datos[2].split("-");
            int tiempo_uso = Integer.parseInt(datos[3]);
            maquinas[i] = new Maquina(id, capacidad, tiempo_uso, carreras);
        }
    }

    public void calcular_uso_total() {
        int totalUso = 0;
        for (Maquina maquina : maquinas) {
            totalUso += maquina.getTiempoUso();
        }
        System.out.println("El tiempo total de uso de todas las salas es: " + totalUso + " horas.");
    }

    public void sala_menos_uso() {
        int minUso = maquinas[0].getTiempoUso();
        int indiceMin = 0;
        for (int i = 1; i < maquinas.length; i++) {
            if (maquinas[i].getTiempoUso() < minUso) {
                minUso = maquinas[i].getTiempoUso();
                indiceMin = i;
            }
        }
        System.out.println("La sala con menos uso es la ID: " + maquinas[indiceMin].getIdSala() + 
                           " con una capacidad de: " + maquinas[indiceMin].getCapacidad() + " máquinas.");
    }

    public void mayor_uso() {
        for (int i = 0; i < maquinas.length - 1; i++) {
            for (int j = 0; j < maquinas.length - i - 1; j++) {
                if (maquinas[j].getTiempoUso() < maquinas[j + 1].getTiempoUso()) {
                    Maquina temp = maquinas[j];
                    maquinas[j] = maquinas[j + 1];
                    maquinas[j + 1] = temp;
                }
            }
        }

        System.out.println("Las 3 salas con mayor uso son:");
        for (int i = 0; i < Math.min(3, maquinas.length); i++) {
            System.out.println("Sala ID: " + maquinas[i].getIdSala() + 
                               " - Capacidad: " + maquinas[i].getCapacidad() + 
                               " - Uso: " + maquinas[i].getTiempoUso() + " horas");
        }
    }

    public static void main(String[] args) {
        Implementacion app = new Implementacion();
        app.calcular_uso_total();
        app.sala_menos_uso();
        app.mayor_uso();
    }
}
