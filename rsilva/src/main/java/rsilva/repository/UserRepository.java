package rsilva.repository;

import org.springframework.data.repository.CrudRepository;

import rsilva.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	User findByEmail(String email);
}
