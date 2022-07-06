package spring_crud.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="age")
    private Integer age;

    public User() {}

    public User(long id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public Integer getAge() { return age; }

    public void setAge(Integer age) { this.age = age; }

    @Override
    public String toString() {
        return "User: " + "id = " + id + ", name= " + name + ", email= " + email + ", age= " + age;
    }
}
