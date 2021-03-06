package com.example.demo;

//import com.example.demo.business.util.ValidPassword;

import javax.persistence.*;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

    @Entity
    @Table(name = "USER_DATA")
    //public class User implements Serializable {
    public class User{
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @NotEmpty
        @Email
        @Column(name = "email", nullable = false)
        private String email;

        @NotEmpty
        //@ValidPassword
        @Column(name = "password")
        private String password;

        @NotEmpty
        @Column(name = "first_name")
        private String firstName;

        @NotEmpty
        @Column(name = "last_name")
        private String lastName;

        @NotEmpty
        @Column(name = "location")
        private String location;

        @AssertTrue
        @Column(name = "enabled")
        private boolean enabled;

        @NotEmpty
        @Column(name = "username", unique = true)
        private String username;

        @OneToMany
        private String packingList;

        @ManyToMany(fetch = FetchType.EAGER)
        @JoinTable(joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name = "role_id"))
        public Collection<Role> roles;

        @OneToMany(mappedBy = "user")
        private Set<Item> items;

        public User() {
          //  roles = new HashSet<>();
            items = new HashSet<>();
        }

        public User(@NotEmpty @Email String email,
                    @NotEmpty String password,
                    @NotEmpty String firstName,
                    @NotEmpty String lastName,
                    @AssertTrue boolean enabled,
                    @NotEmpty String username) {
            this();
            this.email = email;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;
            this.enabled = enabled;
            this.username = username;
        }

        /*public static long getSerialVersionUID() {
            return serialVersionUID;
        }*/

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPackingList() {
            return packingList;
        }

        public void setPackingList(String packingList) {
            this.packingList = packingList;
        }

        public Set<Item> getItems() {
            return items;
        }

        public void setItems(Set<Item> items) {
            this.items = items;
        }

        public Collection<Role> getRoles() {
            return roles;
        }

        public void setRoles(Collection<Role> roles) {
            this.roles = roles;
        }
    }
