package dev.dcoder.business.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.lang.NonNull;

import java.time.DayOfWeek;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class OpeningHour {

    @NotNull(message = "Opening hour is required")
    private DayOfWeek day;

}
