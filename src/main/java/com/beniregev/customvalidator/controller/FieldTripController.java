package com.beniregev.customvalidator.controller;

import com.beniregev.customvalidator.dto.APIResponse;
import com.beniregev.customvalidator.dto.FieldTripForm;
import com.beniregev.customvalidator.service.FieldTripService;
import com.beniregev.customvalidator.validator.FieldTripFormValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class FieldTripController {
    private final FieldTripFormValidator ftfValidator;
    @Autowired
    private FieldTripService ftService;

    public FieldTripController(FieldTripFormValidator ftfValidator) {
        this.ftfValidator = ftfValidator;
    }

    @InitBinder(value = "fieldTripForm")
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(ftfValidator);
    }
    @PostMapping(value = "/fieldtrip")
    public ResponseEntity<APIResponse> signUp(@Valid @RequestBody
                                                      FieldTripForm ftf){
        APIResponse apiResponse = new APIResponse();
        //perform your logic here
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
