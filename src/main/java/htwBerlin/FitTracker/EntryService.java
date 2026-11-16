package htwBerlin.FitTracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntryService {

    @Autowired
    EntryRepository repo;

    public FitTrackerEntry save(FitTrackerEntry entry){
        return repo.save(entry);
    }

    public FitTrackerEntry get(Long id){
        return repo.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<FitTrackerEntry> getAll(){
        Iterable<FitTrackerEntry> iterator = repo.findAll();
        List<FitTrackerEntry> entries = new ArrayList<FitTrackerEntry>();
        for(FitTrackerEntry entry : iterator){
            entries.add(entry);
        }
        return entries;

    }
}
