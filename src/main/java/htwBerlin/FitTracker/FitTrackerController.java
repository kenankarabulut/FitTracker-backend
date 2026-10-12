package htwBerlin.FitTracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class FitTrackerController {

    @GetMapping("/")
    public List<FitTrackerEntry> index() {
        return List.of(new FitTrackerEntry("Chicken-Breast", 500, 20, 0.6, 180, false, LocalDate.of(2026, 8, 22)), new FitTrackerEntry("Apple", 40,true, LocalDate.of(2024, 2, 14)) );
    }
}