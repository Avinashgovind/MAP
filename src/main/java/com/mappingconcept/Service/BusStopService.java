package com.mappingconcept.Service;

import com.mappingconcept.entity.BusStop;

public interface BusStopService {

    BusStop allocateBusRoute(BusStop busStop, long busId, long stopId);
}
