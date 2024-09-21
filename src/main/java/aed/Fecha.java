package aed;

public class Fecha {
    private int _dia;
    private int _mes;

    public Fecha(int dia, int mes) {
        _dia = dia;
        _mes = mes;
    }

    public Fecha(Fecha fecha) {
        _dia = fecha.dia();
        _mes = fecha.mes();
    }

    public Integer dia() {
        return _dia;
    }

    public Integer mes() { 
        return _mes;
    }

    public String toString() { 
        return dia() + "/" + mes();
    }

    @Override
    public boolean equals(Object otra) {
        if(otra == null || otra.getClass() != this.getClass()) return false;
        
        Fecha otraFecha = (Fecha)otra;

        return dia() == otraFecha.dia() && mes() == otraFecha.mes();
    }

    public void incrementarDia() {
        if(mes() == 12) {
            _dia = 1;
            _mes = 1;
        }
        else {
            if(dia() + 1 > diasEnMes(mes())) {
                _dia = 1;
                _mes += 1;
                }
                else {
                    _dia += 1;
                }
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
