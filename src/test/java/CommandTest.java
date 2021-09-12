import command.AddUserCommand;
import command.ButtonTool;
import command.CommandType;
import command.UserService;
import org.junit.Assert;
import org.junit.Test;

public class CommandTest {
    @Test
    public void testUserService(){
        var userService = new UserService();
        var command = new AddUserCommand(userService);
        var button = new ButtonTool(command);
        Assert.assertEquals(CommandType.ADD,button.click());
    }
}
