package hu.bb.entity;



import java.util.Date;

import javax.naming.ldap.LdapName;

import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entry(
  base = "ou=users", 
  objectClasses = { "person", "toDoListPerson", "top" })
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class User {
    
    @Id
    private LdapName id;
    
    @Attribute(name = "cn") 
    private String username;

    @Attribute(name = "sn") 
    private String password;

    @Attribute(name = "email") 
    private String email;

    @Attribute(name = "notificationType") 
    private String notificationType;

    @Attribute(name = "createdAt") 
    private Date createdAt;

    @Attribute(name = "updatedAt") 
    private Date updatedAt;
}
