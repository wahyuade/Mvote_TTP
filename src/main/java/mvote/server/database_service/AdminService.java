package mvote.server.database_service;

import mvote.server.model.AdminModel;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by wahyuade on 22/07/17.
 */
public interface AdminService extends CrudRepository<AdminModel, Long> {
    AdminModel findByUsername(String username);
}
