package bg.alexander.booking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String bookingCode;
    @Column
    private LocalDateTime creationTime;
    @Column(name = "from_time")
    private LocalDateTime from;
    @Column(name = "until_time")
    private LocalDateTime until;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getUntil() {
        return until;
    }

    public void setUntil(LocalDateTime until) {
        this.until = until;
    }
}
