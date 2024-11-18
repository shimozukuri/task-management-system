package project.shimozukuri.taskmanagementsystem.web.dto.task;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CommentDto {

    private String commentator;

    private String content;

    private LocalDateTime commentDate;

}
