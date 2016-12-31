package bg.alexander.booking.controller;


import bg.alexander.booking.model.Booking;
import bg.alexander.booking.repository.BookingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private BookingRepository repository;

    public HelloController(BookingRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/home")
    public Iterable<Booking> homeController(){
        Iterable<Booking> allBookings = repository.findAll();
        return allBookings;
    }

}
