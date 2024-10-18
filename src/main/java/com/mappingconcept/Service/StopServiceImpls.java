package com.mappingconcept.Service;

import com.mappingconcept.Repository.StopRepository;
import com.mappingconcept.entity.Stop;
import org.springframework.stereotype.Service;

@Service
public class StopServiceImpls implements StopService {
   private StopRepository stopRepository;

    public StopServiceImpls(StopRepository stopRepository) {
        this.stopRepository = stopRepository;
    }

    @Override
    public Stop createStop(Stop stop) {
        Stop saved = stopRepository.save(stop);
        return saved;
    }
}
