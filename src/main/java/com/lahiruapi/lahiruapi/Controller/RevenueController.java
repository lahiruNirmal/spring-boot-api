package com.lahiruapi.lahiruapi.Controller;

import com.lahiruapi.lahiruapi.Entity.Revenue;
import com.lahiruapi.lahiruapi.Repository.RevenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class RevenueController {
    //@Autowired
    private RevenueRepository revenueRepository;
    private List<Revenue> revenueList = new ArrayList<>();

    @RequestMapping("/users")
    public List<Revenue> getRevenueByTimeRange(@RequestParam() Date startTime, @RequestParam() Date endTime) {
        return null;
    }
}
