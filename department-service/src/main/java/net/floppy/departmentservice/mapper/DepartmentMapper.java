package net.floppy.departmentservice.mapper;

import net.floppy.departmentservice.dto.DepartmentDto;
import net.floppy.departmentservice.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper {
DepartmentMapper MAPPER = Mappers.getMapper(DepartmentMapper.class);

DepartmentDto maptoDepartmentDto(Department department);
Department maptoDepartment(DepartmentDto departmentDto);
}
