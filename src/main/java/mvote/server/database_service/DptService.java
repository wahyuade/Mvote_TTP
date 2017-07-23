package mvote.server.database_service;

import mvote.server.model.DptModel;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by wahyuade on 20/07/17.
 */
public interface DptService extends CrudRepository<DptModel, Long>{
    DptModel findByVerifikasi(String verifikasi);
    DptModel findByNrp(String nrp);
}
