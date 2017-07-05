/**
 * Created by nahuel on 04/07/2017.
 */
public class TestTrueque {

    TestTrueque (){
        testImporteInicialDebeSerCero();
        testDebeExistirUsuario();
    }
    //TestMethod
    private void testImporteInicialDebeSerCero(){
        Trueque trueque = new Trueque();

        if(trueque.Importe()!=0)
        {
             new Exception("El saldo inicial debe ser 0");
        }
    }

    private void testDebeExistirUsuario(){
        Trueque trueque = new Trueque();

        if (!trueque.ExisteUsuario(1))
        {
            new Exception("El Usuario no existe");
        }
    }

    private void testNoDebeExistirUsuario(){
        Trueque trueque = new Trueque();

        if (trueque.ExisteUsuario(5))
        {
            new Exception("El Usuario no existe");
        }
    }

}
