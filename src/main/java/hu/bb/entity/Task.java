package hu.bb.entity;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Task {

    @Id
    private UUID id;
    
    @Column(nullable=false)
    private String userId;

    @Column(unique = true, nullable=false)
    private String title;

    @Column(nullable=false)
    private String description;

    @Column(nullable=false)
    private Boolean complated;

    @Column(nullable=false)
    private Date dueDate;

    @Column(nullable=false)
    private Date createdAt;

    @Column(nullable=false)
    private Date updatedAt;
}
