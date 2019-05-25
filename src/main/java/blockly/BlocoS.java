package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoS {

public static final int TIMEOUT = 300;

/**
 *
 * @param token
 * @return Var
 */
// BlocoS
public static Var Executar(Var token) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.pushnotification.Operations.sendNotification(Var.valueOf("AAAAgJ5PFTU:APA91bG9YgKRwOy8PldoZ_ySII3hhE3DcYoGEitWQj9J7JqHmdYzPLvZ1v0jPrKtR9Vz1IIZS7RtnRhBaU1m0JTqUImHotI9o8mUOeRz8qT7uo6ZX7kIXi_dGfmvSSaTJQpxi6NUZyYqV7VLJwS6XF4z1NP_83tjyQ"), token, Var.valueOf("!@#$%¨&*()__ áà íÍãâÁÁ~çªº<>:;.,¹²³ü§"), Var.valueOf("!@#$%¨&*()__ áà íÍãâÁÁ~çªº<>:;.,¹²³ü§"), Var.VAR_NULL);
    return Var.VAR_NULL;
   }
 }.call();
}

}

