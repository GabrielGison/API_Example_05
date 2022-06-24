package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    @Autowired(required = false)
    private CarDTO car1 = new CarDTO();

    @GetMapping("/cars")
    public String getCar(){
        car1 = new CarDTO("KH7329", "cabrio", 60000.00);
        return car1.toString();
    }

    @PostMapping("/cars")
    public String postCar(
      /**      @RequestParam(required = false) String id,
            @RequestParam(required = false) String modelName,
            @RequestParam(required = false,defaultValue = "0") double price     **/){
        /** if (id != null) car1.setId(id);
        if (modelName != null) car1.setModelName(modelName);
        if (price != 0) car1.setPrice(price); **/
        System.out.println(car1.toString());
        if (car1.getId() != "00") return "SUCCESS!";
        else return "FAIL!!";

    }
}
