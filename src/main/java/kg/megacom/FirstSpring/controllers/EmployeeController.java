package kg.megacom.FirstSpring.controllers;

import kg.megacom.FirstSpring.models.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


@GetMapping("/employee/{name}")
    public Employee getEmployee(@PathVariable String name){
Employee employee = new Employee();
        return employee;
    }

@GetMapping("/employee")
    public Employee get(@RequestParam String name) {
    Employee employee = new Employee();
    return employee;
}

}
