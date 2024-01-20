package net.floppy.departmentservice.controller;

import lombok.AllArgsConstructor;
import net.floppy.departmentservice.dto.DepartmentDto;
import net.floppy.departmentservice.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/departments/")
@AllArgsConstructor
public class DepartmentController {
    private DepartmentService departmentService;

    @PostMapping("create")
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto)
    {
        DepartmentDto dto = departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @GetMapping("{department_code}")
    public ResponseEntity<DepartmentDto> GetDepartmentCode(@PathVariable("department_code") String departmentCode)
    {
     DepartmentDto dto =  departmentService.getDepartmentDto(departmentCode);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
}
