package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Lot;

public interface IDAOLot extends JpaRepository<Lot,Integer>{

}
