package com.mappingconcept.Controller;

import com.mappingconcept.Service.StopService;
import com.mappingconcept.entity.Stop;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stops")
public class StopController {
    private StopService stopService;

    public StopController(StopService stopService) {
        this.stopService=stopService;
    }

    @PostMapping
    public ResponseEntity<Stop> createStop(@RequestBody Stop stop){
        Stop stop1=stopService.createStop(stop);
        return new ResponseEntity<>(stop1, HttpStatus.CREATED);
    }
}
