package kg.megacom.FirstSpring.services;

import kg.megacom.FirstSpring.models.Department;

import java.util.List;

public interface DepartmentService {

    Department save(Department department);
    Department update(Department department);
    List<Department> findAll();
}
