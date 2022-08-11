package kg.megacom.FirstSpring.controllers;

import kg.megacom.FirstSpring.controllers.base.CrudMethods;
import kg.megacom.FirstSpring.models.Position;
import kg.megacom.FirstSpring.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController implements CrudMethods<Position> {

    @Autowired
    private PositionService positionService;

    @Override
    public List<Position> findAll() {
        return positionService.findAll();
    }

    @Override
    public Position getById(Long id) {
        return null;
    }


    @Override
    public Position save(Position position) {
        return positionService.save(position);
    }

    @Override
    public Position update(Position position) {
        return positionService.update(position);
    }

    @Override
    public Position remove(Long id) {
        return null;
    }

    //save
    //update
    //select
    //delete
}
