package com.example.demo.databaseconnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired

    private EmployeeRepo employeeRepo;

    @PostMapping("save")
    public String saveEmployee(@RequestBody Employee employee) {
        employeeRepo.save(employee);
        return "employee save...";
    }

    @GetMapping("getEmployee")
    public List<Employee> getEmployee() {
        return employeeRepo.findAll();
    }

    @PutMapping("updateEmployee")
    public String updateEmployee(@RequestBody Employee employee) {
        employeeRepo.save(employee);
        return "Record Updated";
    }

    @PutMapping("updateEmployee1")
    public String updateEmployee1(@RequestBody Employee employee) {
        Optional<Employee> employee1 = employeeRepo.findById(employee.getId());
        if (employee1.isPresent()) {
            employee1.get().getAddress();
            employee1.get().getDob();
            employee1.get().getName();
//            employee1.get().getAge();
            employeeRepo.save(employee1.get());
            return "Record Updated";
        } else {
            return "ID not found";
        }
    }

    @DeleteMapping("deleteEmployee")
    public String deleteEmployee(@RequestBody Employee employee) {
        employeeRepo.delete(employee);
        return "Employee Deleted";

    }

    @DeleteMapping("deleteEmployee1/{id}")
    public String delete(@PathVariable("id") Integer id) {
        employeeRepo.deleteById(id);
        return "Employee Deleted";
    }

    @GetMapping("getById/{id}")
    public Employee getEmployeeId(@PathVariable("id") Integer id) {
        return employeeRepo.getReferenceById(id);
    }


    @GetMapping("getByName/{name}")
    public Employee getEmpByName(@PathVariable("name") String name) {
        return employeeRepo.findByName(name);
    }


    @GetMapping("getByName/{name}/{address}")
    public Employee getEmpByNameAndAddress(@PathVariable("name") String name,
                                           @PathVariable("address") String address) {
        return employeeRepo.findByNameAndAddress(name, address);
    }

    @GetMapping("getEmployeeByDate/{firstDate}/{secondDate}")
    public Employee getEmployeeByDate(@PathVariable("firstDate") String firstDate,
                                      @PathVariable("secondDate") String secondDate) {
        return employeeRepo.findByDobBetween(LocalDate.parse(firstDate), LocalDate.parse(secondDate));
    }


    @GetMapping("getEmployeeByAge/{age}")
    public List<Employee> getLessThanAge(@PathVariable("age") Integer age) {
        return employeeRepo.findByAgeLessThan(age);
    }


    @GetMapping("getEmployeeByAgeGreater/{age}")
    public List<Employee> getGreaterThanAge(@PathVariable("age") Integer age) {
        return employeeRepo.findByAgeGreaterThanEqual(age);
    }

@GetMapping("getEmployeeDobAfter/{dob}")
    public List<Employee> getEmployeeDobAfter(@PathVariable("dob") String dob){
        return  employeeRepo.findByDobAfter(LocalDate.parse(dob));
}

//@GetMapping("getNameOrAddress/{name}/{address}")
//    public List<Employee> getNameOrAddress(@PathVariable("name") String name,
//                                           @PathVariable("address") String address){
//    return employeeRepo.findByNameORAddress(name, address);
//}

//
//    @GetMapping("getByNameOrAddress/{name}/{address}")
//    public Employee getByNameOrAddress(@PathVariable("name") String name,
//                                           @PathVariable("address") String address) {
//        return employeeRepo.findByNameOrAddress(name, address);
//    }

//@GetMapping("getFirstnameLike/{name}")
//    public List<Employee> getByNameLike(@PathVariable("name") String name){
//        return employeeRepo.findByNameLike(name);
//}

//    @GetMapping("getAgeIsNull/{age}")
//    public List<Employee> getAgeIsNull(@PathVariable("age") Integer age){
//        return employeeRepo.findByAgeIsNull(age);
//    }

//    @GetMapping("getNameDistinct/{name}")
//    public List<Employee> getNameDistinct(@PathVariable("name") String name){
//        return employeeRepo.findNameDistinct(name);
//    }



}

