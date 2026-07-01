public class UserService {
    private ExternalUserAPI user;

    public UserService(ExternalUserAPI user) {
        this.user = user;
    }

    public String findUser(int id) {
        return user.getUserName(id);
    }
}
