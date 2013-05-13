package utils;

/**
 * Created with IntelliJ IDEA.
 * User: efrolova
 * Date: 25.04.13
 * Time: 17:34
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private String username;
    private String password;
    private String email;
    public User ()
    {
        this.username = null;
        this.password = null;
        this.email = null;

    }
    public User (String name, String pass, String e_mail)
    {
        this.username = name;
        this.password = pass;
        this.email = e_mail;

    }

    public String getUserName ()
    {
        return username;
    }
    public void setUserName ( String userName )
    {
        this.username = userName;
    }

    public String getPassword ()
    {
        return password;
    }
    public void setPassword ( String pass )
    {
        this.password = pass;
    }

    public String getEmail ()
    {
        return email;
    }
    public void setEmail ( String e_mail )
    {
        this.email = e_mail;
    }


}
