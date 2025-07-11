package es.cic.curso25;

public class Sumatorio {
    public double total;

    public double getTotal(){
        return this.total;
    }

    public void lanzar() {
        int arrayNumeros[] = new int[10];

        int resultado = 0;

        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = i + 1;
            resultado += arrayNumeros[i];
        }

        this.total = resultado;
    }
}
//Añadiendo cambios