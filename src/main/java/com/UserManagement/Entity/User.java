package com.UserManagement.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")

public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false, unique=true)
    private String email;

    @Column(nullable=false)
    private Integer age;

    @Column(nullable=false)
    private String phone;

    @Column(nullable=false)
    private String gender;

    @Column(nullable=false)
    private String address;

    @Column(nullable=false)
    private String password;

    @Column(nullable=false)
    private String emailTeams;

    @Column(nullable=false)
    private String passwordTeams;

    @Column(nullable=true)
    private String hbDate;

    @Column(nullable=true)
    private String lastNamer;

    @Column(nullable=false)
    private String ci;

    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(
            name="users_roles",
            joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="ID")},
            inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="ID")})

    private List<Role> roles = new ArrayList<>();

}
