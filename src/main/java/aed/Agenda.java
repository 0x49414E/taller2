package aed;

public class Agenda {
    private Fecha _fechaActual;
    private ArregloRedimensionableDeRecordatorios _recordatorios;

    public Agenda(Fecha fechaActual) {
        _fechaActual = fechaActual;
        _recordatorios = new ArregloRedimensionableDeRecordatorios();
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        _recordatorios.agregarAtras(recordatorio);
    }

    @Override
    public String toString() {
        String header = _fechaActual.toString() + "\n";
        String res = header.concat("=====\n");

        for(int i = 0; i < _recordatorios.longitud(); i++) {
            if(_recordatorios.obtener(i).fecha().equals(_fechaActual)) {
                res = res.concat(_recordatorios.obtener(i).toString()) + "\n";
            }
        }

        return res;
    }

    public void incrementarDia() {
        _fechaActual.incrementarDia();
    }

    public Fecha fechaActual() {
        return new Fecha(_fechaActual);
    }

}
