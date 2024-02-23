package med.voll.api.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.parser.Entity;
import java.util.Optional;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}
