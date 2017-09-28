package mglowinski.library.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public final class User {
  
    @Id
    private String userId;
 
    private String userName;    
    private String userSurname;
    private String userIdentityCardNumber;
    private String userEmail;    
    private String userPassword;
    
    public User() {}
 
    public User(String userName, String userSurname, String userIdentityCardNumber, String userEmail, String userPassword) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userIdentityCardNumber = userIdentityCardNumber;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }
}