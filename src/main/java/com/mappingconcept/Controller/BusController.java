package com.mappingconcept.Controller;

import com.mappingconcept.Service.BusService;
import com.mappingconcept.entity.Bus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/buses")

public class BusController {
    private BusService busService;

    public BusController(BusService busService) {

        this.busService = busService;
    }

    @PostMapping
    public ResponseEntity<Bus> createBus(@RequestBody Bus bus) {
        Bus bus1=busService.createBus(bus);
        return new ResponseEntity<>(bus1, HttpStatus.CREATED);
    }
}
