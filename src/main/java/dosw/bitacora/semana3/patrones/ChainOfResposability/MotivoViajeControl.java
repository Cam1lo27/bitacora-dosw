package dosw.bitacora.semana3.patrones.ChainOfResposability;

public class MotivoViajeControl extends ControlMigratorioHandler {

    @Override
    public void procesar(IngresoRequest req) {
        if (req.isMotivoValido()) {
            System.out.println("[Motivo de Viaje] Aprobado");
            continuar(req);
        } else {
            System.out.println("[Motivo de Viaje] Rechazado. Motivo no válido.");
        }
    }
}