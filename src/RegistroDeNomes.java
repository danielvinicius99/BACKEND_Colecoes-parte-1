package Exercicio;

public class RegistroDeNomes implements Comparable<RegistroDeNomes> {

    private String registro;

    public RegistroDeNomes(String registro) {
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    @Override
    public int compareTo(RegistroDeNomes outro) {
        return this.registro.compareTo(outro.getRegistro());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return registro;
    }
}