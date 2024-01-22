package net.floppy.employeeservice.controller;

import lombok.AllArgsConstructor;
import net.floppy.employeeservice.dto.ApiResponseDto;
import net.floppy.employeeservice.dto.EmployeeDto;
import net.floppy.employeeservice.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees/")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping("create")
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto empDto = employeeService.saveEmployees(employeeDto);
        return new ResponseEntity<>(empDto, HttpStatus.CREATED);
    }

    @GetMapping("{emp_id}")
    public ResponseEntity<ApiResponseDto> getEmpById(@PathVariable("emp_id") Long empId)
    {
        ApiResponseDto apiResponseDto = employeeService.getEmpById(empId);
        return new ResponseEntity<>(apiResponseDto,HttpStatus.OK);
    }
}
