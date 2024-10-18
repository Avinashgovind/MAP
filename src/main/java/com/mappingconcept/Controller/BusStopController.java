package com.mappingconcept.Controller;

import com.mappingconcept.Service.BusStopService;
import com.mappingconcept.entity.BusStop;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bus-stops")
// This controller is responsible for managing bus stops. It should have methods for CRUD operations on bus stops.
public class BusStopController {
    private BusStopService busStopService;

    public BusStopController(BusStopService busStopService) {
        this.busStopService = busStopService;
    }


    @PostMapping
    public ResponseEntity<BusStop> allocateBusRoute(@RequestBody BusStop busStop,
            @RequestParam long busId,
            @RequestParam long stopId) {
        BusStop busStop1 = busStopService.allocateBusRoute(busStop,busId, stopId);
        return new ResponseEntity<>(busStop1, HttpStatus.CREATED);
    }
}
