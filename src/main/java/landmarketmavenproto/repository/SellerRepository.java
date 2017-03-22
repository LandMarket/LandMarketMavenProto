package landmarketmavenproto.repository;

import landmarketmavenproto.model.Seller;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Nik_NB on 18.03.2017.
 */
public interface SellerRepository extends MongoRepository<Seller, String> {
}
