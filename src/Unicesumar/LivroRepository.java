package unicesumar.livrorestservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class LivroRepository extends JpaRepository<Livro, Long>{
    
}