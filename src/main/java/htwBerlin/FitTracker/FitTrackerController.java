package htwBerlin.FitTracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class FitTrackerController {

    @Autowired
    EntryService service = new EntryService();

    @CrossOrigin(origins = {"https://fittracker-frontend-b0wf.onrender.com/", "http://localhost:5173/"})
    @GetMapping("/entries")
    public List<FitTrackerEntry> getEntries() {
        return List.of(new FitTrackerEntry(1L, "Haferflocken", 80, 296.0, 47.0, 10.8, LocalDate.of(2026, 10, 19)),
                new FitTrackerEntry(2L, "Magerquark", 250, 170.0, 10.0, 30.0, LocalDate.of(2026, 10, 19))
        );
    }

    @CrossOrigin
    @PostMapping("/entries")
    public FitTrackerEntry createEntry(@RequestBody FitTrackerEntry entry){
        return service.save(entry);
    }

    @CrossOrigin
    @GetMapping("/entries/{id}")
    public FitTrackerEntry getbyID(@PathVariable String id){
        Long entryId = Long.parseLong(id);
        return service.get(entryId);
    }
}