package bg.alexander.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@Configuration
@EntityScan(basePackages = {"bg.alexander.booking.model"}, basePackageClasses = {Jsr310JpaConverters.class})
@EnableJpaRepositories(basePackages = "bg.alexander.booking.repository")
public class RoomBookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoomBookingApplication.class, args);
    }

}
