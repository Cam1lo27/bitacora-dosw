package dosw.bitacora.semana3.patrones.ChainOfResposability;

public abstract class ControlMigratorioHandler implements ControlMigratorio {

    protected ControlMigratorio siguiente;

    @Override
    public void setSiguiente(ControlMigratorio siguiente) {
        this.siguiente = siguiente;
    }

    protected void continuar(IngresoRequest req) {
        if (siguiente != null) {
            siguiente.procesar(req);
        }
    }
}
