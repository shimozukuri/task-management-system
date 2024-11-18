package project.shimozukuri.taskmanagementsystem.domain.task;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import project.shimozukuri.taskmanagementsystem.domain.user.User;

import java.util.Set;

@Entity
@Table(name = "tasks")
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private User author;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "executor_id", referencedColumnName = "id")
    private User executor;

    @Enumerated(value = EnumType.STRING)
    private Priority priority;

    @Enumerated(value = EnumType.STRING)
    private Status status;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(inverseJoinColumns = @JoinColumn(name = "comment_id"))
    private Set<Comment> comments;
}
