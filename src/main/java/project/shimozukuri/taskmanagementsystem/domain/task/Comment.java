package project.shimozukuri.taskmanagementsystem.domain.task;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import project.shimozukuri.taskmanagementsystem.domain.user.User;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
@Getter
@Setter
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "commentator_id", referencedColumnName = "id")
    private User commentator;

    private String content;

    @Column(name = "comment_date")
    private LocalDateTime commentDate;
}
