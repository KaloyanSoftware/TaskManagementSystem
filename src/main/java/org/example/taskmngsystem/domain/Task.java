package org.example.taskmngsystem.domain;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    private String name;

    private String description;

    private Status taskStatus;

    private LocalDateTime registeredTime;

    private LocalDateTime dueTime;

    @Override
    public String toString() {
        return String.format("%s: %s, %s", this.name, this.description,this.taskStatus);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return Objects.equals(name, task.name) && Objects.equals(description, task.description) && taskStatus == task.taskStatus && Objects.equals(registeredTime, task.registeredTime) && Objects.equals(dueTime, task.dueTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, taskStatus, registeredTime, dueTime);
    }
}
