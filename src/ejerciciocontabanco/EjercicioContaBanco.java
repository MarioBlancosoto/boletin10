
package ejerciciocontabanco;

/**
 *
 * @author Brais
 */
public class EjercicioContaBanco {

    public static void main(String[] args) {
        
        Banco cuenta1 = new Banco ();
        cuenta1.setNome("Arturo");
        cuenta1.setNumConta("0001");
        cuenta1.setSaldo(200);
        
        Banco cuenta2 = new Banco ();
        cuenta2.setNome("Mario");
        cuenta2.setNumConta("0002");
        cuenta2.setSaldo(150);
        
        cuenta1.transferencia("cuenta2", 500);
        
        cuenta1.visualizarSaldo();
    }
    
}
