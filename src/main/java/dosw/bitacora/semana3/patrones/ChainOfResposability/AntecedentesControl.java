package dosw.bitacora.semana3.patrones.ChainOfResposability;

public class AntecedentesControl extends ControlMigratorioHandler {

    @Override
    public void procesar(IngresoRequest req) {
        if (req.isAntecedentesOk()) {
            System.out.println("[Antecedentes] Aprobado");
            continuar(req);
        } else {
            System.out.println("[Antecedentes] Rechazado por antecedentes.");
        }
    }
}

