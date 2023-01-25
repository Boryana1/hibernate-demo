package com.bd.HibernateDemo.repositories;

import com.bd.HibernateDemo.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findByLocationId(Integer id);

}


