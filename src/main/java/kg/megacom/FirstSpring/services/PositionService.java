package kg.megacom.FirstSpring.services;

import kg.megacom.FirstSpring.models.Position;

import java.util.List;

public interface PositionService {

    Position save(Position position);
    Position update(Position position);
    List<Position> findAll();
}
