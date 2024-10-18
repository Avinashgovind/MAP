package com.mappingconcept.Service;

import com.mappingconcept.Repository.BusRepository;
import com.mappingconcept.entity.Bus;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpls implements BusService {
    private BusRepository busRepository;

    public BusServiceImpls(BusRepository busRepository) {
        this.busRepository = busRepository;
    }


    @Override
    public Bus createBus(Bus bus) {
        Bus saved = busRepository.save(bus);
        return saved;
    }
}
