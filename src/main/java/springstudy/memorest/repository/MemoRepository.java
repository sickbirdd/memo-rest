package springstudy.memorest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import springstudy.memorest.domain.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> { }
