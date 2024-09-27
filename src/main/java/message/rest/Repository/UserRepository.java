package message.rest.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import message.rest.Model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID>{

}
