package suite;
import contactUS.CustomeService;
import elementFromDropDown.DropDown;
import forgotPassword.ForgotPassword;
import logIn.LogInWithExistingUser;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import searchClothes.Search;
import signInPhase.SignIn;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CustomeService.class,
        DropDown.class,
        ForgotPassword.class,
        LogInWithExistingUser.class,
        Search.class,
        SignIn.class

})
public class Smoke {
}

