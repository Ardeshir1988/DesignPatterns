package command;

public class AddUserCommand implements Command{
    private final UserService userService;

    public AddUserCommand(UserService userService) {
        this.userService = userService;
    }

    @Override
    public CommandType execute() {
        return userService.addUser();
    }
}
