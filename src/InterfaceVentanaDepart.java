import java.awt.event.ActionEvent;

public interface InterfaceVentanaDepart {
    public void consulDepart(ActionEvent e, String noExisteDepart);
    public void borraDepart(ActionEvent e, String noExisteDepart);
    public void modifDepart(ActionEvent e, String noExisteDepart);
    public int altaDepart(ActionEvent e, String param);
}