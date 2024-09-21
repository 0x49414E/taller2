package aed;

class ArregloRedimensionableDeRecordatorios {
    private Recordatorio[] _lista;
    private int _capacidad;
    private int _longitud;

    public ArregloRedimensionableDeRecordatorios() {
        this(10);
    }

    public ArregloRedimensionableDeRecordatorios(int capacidadInicial) {
        if(capacidadInicial > 0) {
            _capacidad = capacidadInicial;
            _longitud = 0;
            _lista = new Recordatorio[_capacidad];
        }
    }

    public int longitud() {
        return _longitud;
    }

    public void agregarAtras(Recordatorio r) {
        if(_capacidad == _longitud + 1) {
            _lista = appendToList(r);
        }
        else {
            _lista[_longitud] = r;
            _longitud += 1;
        }
    }

    private Recordatorio[] appendToList(Recordatorio r) {
        int nCapacidad = _capacidad * 2;

        Recordatorio[] nLista = new Recordatorio[nCapacidad];

        for(int i = 0; i < _capacidad; i++) {
            nLista[i] = _lista[i];
        }

        _capacidad = nCapacidad;

        nLista[_longitud] = r;

        _longitud += 1;

        return nLista;
    }

    public Recordatorio obtener(int i) {
        if(i >= _longitud) {
            return null;
        }
        else {
            return _lista[i];
        }
    }

    public void quitarAtras() {
        _longitud -= 1; 

        Recordatorio[] nLista = new Recordatorio[_capacidad];

        for(int i = 0; i < _longitud; i++){
            nLista[i] = _lista[i];
        }

        _lista = nLista;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        if(indice > _longitud) {
            return;
        }
        else {
            _lista[indice] = valor;
        }
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        _lista = vector._lista.clone();
        _capacidad = vector._capacidad;
        _longitud = vector._longitud;
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        // Implementar
        return null;
    }
}
