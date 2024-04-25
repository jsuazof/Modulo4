public class Persona {
    private string nombre;
    private double saldo;
    private List<Cuenta> cuentas;

    public Persona(string nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.cuentas = new List<Cuenta>();
    }

}
