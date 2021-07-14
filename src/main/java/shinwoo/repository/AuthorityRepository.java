package shinwoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shinwoo.entity.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}