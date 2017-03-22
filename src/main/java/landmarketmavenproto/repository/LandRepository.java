package landmarketmavenproto.repository;

import landmarketmavenproto.model.Land;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Nik_NB on 19.03.2017.
 */
public interface LandRepository extends MongoRepository<Land, String> {
}
