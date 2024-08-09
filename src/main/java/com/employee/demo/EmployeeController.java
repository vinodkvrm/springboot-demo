package com.employee.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//@Controller // @ResponseBody{html json , xml }
@RestController// auto matically sends json or xml response
public class EmployeeController {

    @GetMapping("/getEmployeeList")
    public ResponseEntity<List<Employee>> getEmployeeList(){
        Employee e = new Employee();
        e.setEmpId(1);
        e.setEmpName("Kavya");
        e.setAge(30);
        e.setSal(100000d);

        Employee e1 = new Employee();
        e1.setEmpId(2);
        e1.setEmpName("Vinod");
        e1.setAge(33);
        e1.setSal(90000d);

        return  ResponseEntity.ok(Arrays.asList(e1,e));

    }

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<Employee> getEmployeeList(@PathVariable Integer id){
        Employee e = new Employee();
        e.setEmpId(id);
        e.setEmpName("Kavya");
        e.setAge(30);
        e.setSal(100000d);

        return ResponseEntity.ok(e);


    }


}
