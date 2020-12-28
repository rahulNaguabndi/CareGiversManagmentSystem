package com.Caretackers.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.Caretackers.model.Login;

@Repository
public interface UserLoginRepo extends CrudRepository<Login, Integer> {

}
