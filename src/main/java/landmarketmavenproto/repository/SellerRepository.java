package landmarketmavenproto.repository;

import landmarketmavenproto.model.Seller;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface SellerRepository extends MongoRepository<Seller, String> {
}
