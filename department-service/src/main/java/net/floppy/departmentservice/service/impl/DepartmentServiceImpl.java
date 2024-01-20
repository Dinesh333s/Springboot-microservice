package net.floppy.departmentservice.service.impl;

import lombok.AllArgsConstructor;
import net.floppy.departmentservice.dto.DepartmentDto;
import net.floppy.departmentservice.entity.Department;
import net.floppy.departmentservice.repository.DepartmentRepo;
import net.floppy.departmentservice.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepo departmentRepo;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
//        Department department = DepartmentMapper.MAPPER.maptoDepartment(departmentDto);
        Department department = new Department(departmentDto.getId(),
                departmentDto.getDepartmentName(),departmentDto.getDepartmentDescription(),departmentDto.getDepartmentCode());

        Department saved_department = departmentRepo.save(department);
//        DepartmentDto department_dto = DepartmentMapper.MAPPER.maptoDepartmentDto(saved_department);
        DepartmentDto department_dto = new DepartmentDto(saved_department.getId(),saved_department.getDepartmentName(),
                saved_department.getDepartmentDescription(),saved_department.getDepartmentCode());
        return department_dto;
    }

    @Override
    public DepartmentDto getDepartmentDto(String depCode) {
        Department department = departmentRepo.findByDepartmentCode(depCode);
        DepartmentDto dto = new DepartmentDto(department.getId(),
                department.getDepartmentName(),department.getDepartmentDescription(),department.getDepartmentCode());
        return dto;
    }


}
