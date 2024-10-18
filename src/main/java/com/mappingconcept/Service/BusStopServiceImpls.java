package com.mappingconcept.Service;

import com.mappingconcept.Repository.BusRepository;
import com.mappingconcept.Repository.BusStopRepository;
import com.mappingconcept.Repository.StopRepository;
import com.mappingconcept.entity.Bus;
import com.mappingconcept.entity.BusStop;
import com.mappingconcept.entity.Stop;
import org.springframework.stereotype.Service;

@Service
public class BusStopServiceImpls implements BusStopService{
    private BusRepository busRepository;
    private StopRepository stopRepository;
    private BusStopRepository busStopRepository;

    public BusStopServiceImpls(BusRepository busRepository, StopRepository stopRepository, BusStopRepository busStopRepository) {
        this.busRepository = busRepository;
        this.stopRepository = stopRepository;
        this.busStopRepository = busStopRepository;
    }


    @Override
    public BusStop allocateBusRoute(BusStop busStop, long busId, long stopId) {
        Bus bus=busRepository.findById(busId).get();
        Stop stop=stopRepository.findById(stopId).get();

        busStop.setBus(bus);
        busStop.setStop(stop);

        BusStop save = busStopRepository.save(busStop);
        return save;
    }
}
