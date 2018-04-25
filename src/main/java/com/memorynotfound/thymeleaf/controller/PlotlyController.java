package com.memorynotfound.thymeleaf.controller;

import com.memorynotfound.thymeleaf.model.PlotlyData;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class PlotlyController {

    @RequestMapping("/")
    public String welcome() {
        return "home";
    }


    @ResponseStatus(OK)
    @RequestMapping(value = "/plotly/{id}", method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST", value = "Response a string describing if the /plotly/{id} is successfully created or not.", notes = "e.g. json: jsonString,index: 1")
    public void sell(@RequestBody @Valid PlotlyData plotlyData, @PathVariable int index) {


    }

    @RequestMapping(value = "/plotly/{count}", method = GET)
    @ApiOperation(httpMethod = "GET", value = "Response a string describing if the /plotly is successfully created or not.", notes ="")
    public List<Object> plotlyList(@PathVariable int count) {
        return null;
    }
}
