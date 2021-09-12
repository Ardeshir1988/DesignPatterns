import command.AddUserCommand;
import command.ButtonTool;
import command.UserService;
import org.junit.Test;

public class CommandTest {
    @Test
    public void testUserService(){
        var userService = new UserService();
        var command = new AddUserCommand(userService);
        var button = new ButtonTool(command);
        button.click();
    }
}
