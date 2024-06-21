package hu.bb.dto;

import java.util.Date;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TaskDTO {

    private UUID id;
    private String userId;
    private String title;
    private String description;
    private Boolean complated;
    private String priority;
    private Date dueDate;
}
