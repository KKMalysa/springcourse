package pl.karolmalysa.springcourse.components;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
/*     SKOŁPY ŁEBOWE :D
"request" będzie pokazywał czas ostatniego requestu,
np. po kliknięciu "podgląd" wyswietlany czas się zmieni

"session" ostatniej sesji, to znaczy, ze czas będzie
ten sam od moomentu otwarcia strony do jej zamknięcia
 */
@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TimeComponent {

    private LocalDateTime time = LocalDateTime.now();

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
