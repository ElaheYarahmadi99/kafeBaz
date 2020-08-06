package model.repository;

import model.entity.person.Person;

import java.util.List;

public interface PersonDA<T extends Person> {

    void insertToDB(T person);
    void updateDB(T person);
    void delete(T person);
    List<T> selectAll();

}
