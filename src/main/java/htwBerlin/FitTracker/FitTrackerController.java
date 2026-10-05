package htwBerlin.FitTracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FitTrackerController {

    @GetMapping("/")
    public List<FitTrackerEntry> index() {
        return List.of(new FitTrackerEntry(1, Gender.MALE, 180), new FitTrackerEntry(2, Gender.FEMALE, 160));
    }

}