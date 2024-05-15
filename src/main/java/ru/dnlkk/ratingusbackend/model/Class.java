package ru.dnlkk.ratingusbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "class")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "userClass")
    private List<UserCode> userCodes;
  
    @ManyToOne
    @JoinColumn(name = "school_id", referencedColumnName = "id")
    private School school;

    @ManyToMany(mappedBy = "classes")
    private List<User> students;

    @ManyToMany(mappedBy = "classes")
    private List<Announcement> announcements;

    @OneToMany(mappedBy = "classForUserRole")
    private List<UserRole> userRole;

    @OneToMany(mappedBy = "scheduleForClass")
    private List<Schedule> schedules;

}
