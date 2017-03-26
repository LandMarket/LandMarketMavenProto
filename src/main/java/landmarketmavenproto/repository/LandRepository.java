package landmarketmavenproto.repository;

import landmarketmavenproto.model.Land;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LandRepository extends MongoRepository<Land, String> {
}
