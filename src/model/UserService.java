package model;

public class UserService {
    private UserDAO userDAO;
    private User currentUser;

    public UserService(){
        this.userDAO = new UserDAO();
    }

    //登录
    public boolean login(String userName, String password){
        if(userDAO.validateUser(userName, password)){
            currentUser = new User(userName, password);
            return true;
        }
        return false;
    }

    //游客登录
    public void loginAsGuest(){
        currentUser = new User();
    }

    //注册
    public boolean register(String userName, String password){
        if(userDAO.isUserNameExists(userName)){
                return false;
        }
        return userDAO.registerUser(userName, password);
    }

    //获取当前用户
    public User getCurrentUser(){
        return currentUser;
    }

    //退出登录
    public void logout(){
        currentUser = null;
    }
}
