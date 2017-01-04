package bg.alexander.booking.controller;


import bg.alexander.booking.model.Booking;
import bg.alexander.booking.repository.BookingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BookingsController {
    private BookingRepository repository;

    public BookingsController(BookingRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/bookings")
    public Iterable<Booking> homeController(){
        Iterable<Booking> allBookings = repository.findAll();
        return allBookings;
    }

}
