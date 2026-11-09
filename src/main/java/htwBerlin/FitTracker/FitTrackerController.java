package htwBerlin.FitTracker;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class FitTrackerController {

    @CrossOrigin(origins = {"https://fittracker-frontend-b0wf.onrender.com/", "http://localhost:5173/"})
    @GetMapping("/entries")
    public List<FitTrackerEntry> getEntries() {
        return List.of(new FitTrackerEntry(1L, "Haferflocken", 80, 296.0, 47.0, 10.8, LocalDate.of(2026, 10, 19)),
                new FitTrackerEntry(2L, "Magerquark", 250, 170.0, 10.0, 30.0, LocalDate.of(2026, 10, 19))
        );
    }
}