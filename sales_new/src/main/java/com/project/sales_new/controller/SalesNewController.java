package com.project.sales_new.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.sales_new.dto.UserauthDTO;
import com.project.sales_new.dto.CityDTO;
import com.project.sales_new.dto.SalesdataDTO;
import com.project.sales_new.entity.*;
import com.project.sales_new.repository.CityRepository;
import com.project.sales_new.service.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost")
@RestController
public class SalesNewController {
    @Autowired
    private CityService cityS;

    @Autowired
    private UsersService UService;

    @Autowired
    private ProductService PService;

    @Autowired
    private TimeperiodService TService;

    @Autowired
    private SalesService SService;

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody String login(@RequestBody UserauthDTO userDTO) {
        // Use the userDTO instance here
        // System.out.println(userDTO.getUsername());
        Users user_new = UService.findByCustomQueryNew(userDTO.getUsername());
        if (user_new != null) {
            String user_name = userDTO.getUsername();
            String password = userDTO.getPassword();
            // System.out.println(user_new.email);
            // System.out.println(user_name);
            // System.out.println(user_new.password);
            // System.out.println(password);
            if (user_name.equals((String) user_new.email) && password.equals((String) user_new.password)) {
                return "true";
            } else {
                return "false";
            }
        } else {
            return "false";
        }
    }

    // @RequestMapping(value = "/getproduct", method = RequestMethod.POST)
    // public @ResponseBody List<Product> product(@RequestBody UserauthDTO userDTO)
    // {
    // Users user_new = UService.findByCustomQueryNew(userDTO.getUsername());
    // Integer owner_id = user_new.id;
    // if (user_new != null) {
    // List<Product> product_list = PService.findByCustomQueryNew(owner_id);
    // return
    // }

    // }

    @RequestMapping(value = "/getproduct", method = RequestMethod.POST)
    public @ResponseBody List<Product> product(@RequestBody UserauthDTO userDTO) {
        Users user_new = UService.findByCustomQueryNew(userDTO.getUsername());
        System.out.println(user_new.email);
        if (user_new != null) {
            Integer owner_id = user_new.id;
            List<Product> product_list = PService.findByCustomQueryNew(owner_id);
            if (product_list != null) {
                return product_list;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @RequestMapping(value = "/gettimeperiod", method = RequestMethod.POST)
    public @ResponseBody List<Timeperiod> timeperioid(@RequestBody UserauthDTO userDTO) {
        Users user_new = UService.findByCustomQueryNew(userDTO.getUsername());
        // System.out.println(user_new.email);
        if (user_new != null) {
            // Integer owner_id = user_new.id;
            List<Timeperiod> tp_list = TService.findallTPnew();
            if (tp_list != null) {
                return tp_list;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @RequestMapping(value = "/getsales", method = RequestMethod.POST)
    public @ResponseBody List<Sales> salesdata(@RequestBody SalesdataDTO salesDTO) {
        Users user_new = UService.findByCustomQueryNew(salesDTO.getUsername());
        // System.out.println(user_new.email);
        if (user_new != null) {
            Integer owner_id = user_new.id;
            String product_id = salesDTO.getProductId();
            System.out.println(owner_id);
            System.out.println(salesDTO.getPassword());
            List<Sales> sales_data = SService.findSalesData(owner_id, product_id);
            if (sales_data != null) {
                return sales_data;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @PostMapping("/citydata")
    public List<City> getCityById(@RequestBody CityDTO cDto) {
        // CityService cityService = new CityService();
        String city_id = cDto.getCityId();
        System.out.println(cDto.getCityId());
        return cityS.findByCustomQueryNew(city_id);
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
