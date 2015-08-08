package com.spr.model;



import java.io.Serializable;
import java.util.List;
 



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
 



import org.codehaus.jackson.annotate.JsonManagedReference;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
 
@SuppressWarnings("serial")
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Customer implements Serializable {
 
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
 
    @NotNull
    private String name;
 
    @NotNull
    private String email;
 
    @NotNull
    private String address;
 
    @NotNull
    @Column(name = "phone_number")
    private String phoneNumber;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPhoneNumber() {
        return phoneNumber;
    }
 
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    //bi-directional many-to-one association to Request
     @OneToMany(mappedBy="customer",fetch = FetchType.EAGER, cascade = CascadeType.ALL)//
     @JsonManagedReference
    private List<Request> requests;
 
    public List<Request> getRequests() {
        return this.requests;
    }
 
    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }
 
 
 
}
