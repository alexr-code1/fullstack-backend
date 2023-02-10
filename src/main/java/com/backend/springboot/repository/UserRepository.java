/*Description:
--------------------------------------
Table and PK of Table are parameters
--------------------------------------
perform DB operations*/

package com.backend.springboot.repository;
import com.backend.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

}
