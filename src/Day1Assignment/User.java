package Day1Assignment;

public class User implements IValidate{
    private String UserId;

    private String UserName;

    User (String UserId,String UserName){
        this.UserId=UserId;
        this.UserName=UserName;
    }

    public User() {

    }

    public void adduser(String UserId,String UserName){
        this.UserId=UserId;
        this.UserName=UserName;
    }
    public boolean IsAuthenticated(String UserId,String UserName){
        return  this.UserId.equals(UserId) && this.UserName.equals(UserName);

    }

}
