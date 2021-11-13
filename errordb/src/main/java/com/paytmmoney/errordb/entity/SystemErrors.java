
package com.paytmmoney.errordb.entity;
//import com.paytmmoney.equities.bo.commonuser.entity.UserSystem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;


@EntityListeners(AuditingEntityListener.class)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="system_retryable_error")
public class SystemErrors{
    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    /*@NotNull()
    @Column(name = "system_name")
    @Enumerated(EnumType.STRING)
    private UserSystem systemName;*/

    @NotNull()
    @Column(name = "error_message")
    private String errorMessage;

    @NotNull()
    @Column(name="retry_after_time")
    private int retryAfterTime;

    @NotNull()
    @Column(name = "created_at")
    private Timestamp createdAt;

    @NotNull()
    @Column(name = "updated_at")
    private Timestamp updatedAt;
}

