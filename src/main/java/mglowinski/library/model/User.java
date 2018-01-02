package mglowinski.library.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public final class User {
  
    @Id
    private String userId;
 
    private String userName;    
    private String userSurname;
    private String userIdentityCardNumber;
    private String userEmail;    
    private String userPassword;
    
    public User() {}
 
    public User(String userId, String userName, String userSurname, String userIdentityCardNumber, String userEmail, String userPassword) {
        this.setUserId(userId);
    	this.setUserName(userName);
        this.setUserSurname(userSurname);
        this.setUserIdentityCardNumber(userIdentityCardNumber);
        this.setUserEmail(userEmail);
        this.setUserPassword(userPassword);
    }

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public String getUserIdentityCardNumber() {
		return userIdentityCardNumber;
	}

	public void setUserIdentityCardNumber(String userIdentityCardNumber) {
		this.userIdentityCardNumber = userIdentityCardNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}