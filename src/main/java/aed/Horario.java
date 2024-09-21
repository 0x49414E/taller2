package aed;

public class Horario {
    private int _hora;
    private int _minutos;

    public Horario(int hora, int minutos) {
        _hora = hora;
        _minutos = minutos;
    }

    public Horario(Horario otro) {
        _hora = otro.hora();
        _minutos = otro.minutos();
    }

    public int hora() {
        return _hora;
    }

    public int minutos() {
        return _minutos;
    }

    @Override
    public String toString() {
        return hora() + ":" + minutos();
    }

    @Override
    public boolean equals(Object otro) {
        if(otro == null || otro.getClass() != this.getClass()) return false;
        
        Horario otroHorario = (Horario)otro;

        return hora() == otroHorario.hora() && minutos() == otroHorario.minutos();
    }
}
