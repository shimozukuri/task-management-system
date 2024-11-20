package project.shimozukuri.taskmanagementsystem.web.dto.task;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class TaskDto {

    private String title;

    private String description;

    private String author;

    private String executor;

    private String priority;

    private String status;

    private Set<CommentDto> comments;

}
