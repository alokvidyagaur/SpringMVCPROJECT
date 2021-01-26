package controller;

public class UserLogin 
{
private String UserName;
private String userPasswd;
public UserLogin()
{
	System.out.println("Constructor");
}
public String getUserName() {
	return UserName;
}

public void setUserName(String userName) {
	UserName = userName;
}
public String getUserPasswd() {
	return userPasswd;
}
public void setUserPasswd(String userPasswd) {
	this.userPasswd = userPasswd;
}
@Override
public String toString() {
	return "UserLogin [UserName=" + UserName + ", userPasswd=" + userPasswd + "]";
}

}
