package Common;

public class User implements java.io.Serializable{

    private String username;
    private String userpwd;
    //type = 1 :admin
    //type = 2 :updates and look
    //type = 3 :only can look
    private int type;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


}