package reactspringbootdemo.springreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import reactspringbootdemo.springreact.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
