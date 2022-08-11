package kg.megacom.FirstSpring.controllers;

import kg.megacom.FirstSpring.controllers.base.CrudMethods;
import kg.megacom.FirstSpring.models.Department;
import kg.megacom.FirstSpring.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController implements CrudMethods<Department> {


    @Autowired
    private DepartmentService departmentService;


    @Override
    public List<Department> findAll() {
        return departmentService.findAll();
    }

    @Override
    public Department getById(Long id) {
        return null;
    }

    @Override
    public Department save(Department department) {
        return departmentService.save(department);
    }

    @Override
    public Department update(Department department) {
        return departmentService.save(department);
    }

    @Override
    public Department remove(Long id) {
        return null;
    }
}
