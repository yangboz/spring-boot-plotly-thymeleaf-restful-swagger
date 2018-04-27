package com.memorynotfound.thymeleaf.controller;

import com.memorynotfound.thymeleaf.model.PlotlyData;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class PlotlyController {

    @RequestMapping("/")
    public String welcome() {
        return "home";
    }

    private List<String> plotlyExamples = new ArrayList<String>(
            Arrays.asList("2d-category-plots","2d-timeseries-plots","3d-surface-plots", "3d-mesh-plots", "3d-scatter-plots"));

    @RequestMapping(value = "/example/{index}", method = GET)
    public String listOne(@PathVariable int index) {
        return plotlyExamples.get(index);
    }


    @ResponseStatus(OK)
    @RequestMapping(value = "/plotly/{id}", method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST", value = "Response a string describing if the /plotly/{id} is successfully created or not.", notes = "e.g. json: jsonString,index: 1")
    public String plotlyOne(@RequestBody @Valid PlotlyData plotlyData, @PathVariable int index) {
        //

        //
        return plotlyExamples.get(index);
    }

    //@see:https://plot.ly/javascript/colorscales/#custom-colorscale
    private List<String> colorScales = new ArrayList<String>(
            Arrays.asList("Blackbody","Electric","Earth", "Bluered"
                    ,"YIOrRd","YIGnBu","RdBu","Portland","Picnic"
                    ,"Jet","Hot","Greys","Greens"));


    @RequestMapping(value = "/plotly/{index}", method = GET)
    @ApiOperation(httpMethod = "GET", value = "Response a string describing plotly templates successfully created or not.", notes ="")
    public ModelAndView plotlyListAll(@PathVariable int index
            ,@RequestParam("dataUrl") String dataUrl
            ,@RequestParam("title") String titleStr
            ,@RequestParam("colorscale") int colorscaleIndex
            ,@RequestParam("width") int width
            ,@RequestParam("height") int height) {
//        return plotlyExamples.get(index);
        // return a model and a view (just as an example)
        ModelAndView mv = new ModelAndView();
        mv.addObject("dataUrl", dataUrl);
        mv.addObject("title", titleStr);
        mv.addObject("colorscale", colorScales.get(colorscaleIndex));
        mv.addObject("width", width);
        mv.addObject("height", height);
        mv.setViewName(plotlyExamples.get(index));
        return mv;
    }
}
