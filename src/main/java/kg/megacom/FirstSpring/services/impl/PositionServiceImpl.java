package kg.megacom.FirstSpring.services.impl;

import kg.megacom.FirstSpring.dao.PositionRepository;
import kg.megacom.FirstSpring.models.Position;
import kg.megacom.FirstSpring.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionRepository positionRepository;

    @Override
    public Position save(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public Position update(Position position) {
        return positionRepository.save(position);
    }

    public List<Position> findAll () { return positionRepository.findAll();}
}
