package dosw.bitacora.semana3.patrones.ChainOfResposability;

public interface ControlMigratorio {
    void setSiguiente(ControlMigratorio siguiente);
    void procesar(IngresoRequest req);
}
