package shop.tripn.app.demo.calculator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data@NoArgsConstructor@AllArgsConstructor@Document(collection = "users")
public class User {

    private @Id long userId;
    private String username;
    private String name;
    private String email;
    private String password;
    private Date regDate;


    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                "username='" + username + '\'' +
                "name='" + name + '\'' +
                "email='" + email + '\'' +
                "password='" + password + '\'' +
                "regDate=" + regDate +
                '}';
    }
}
