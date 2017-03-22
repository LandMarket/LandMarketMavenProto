package landmarketmavenproto.controller;

import landmarketmavenproto.model.Seller;
import landmarketmavenproto.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Nik_NB on 18.03.2017.
 */
@RestController
@RequestMapping("/seller")
public class SellerController {
    @Autowired
    SellerRepository srepository;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String, Object> createSeller(@RequestBody Map<String, Object> sellerMap){
//    Seller seller = new Seller(sellerMap.get("passport").toString(),
//            sellerMap.get("companyName").toString(),
//            sellerMap.get("phone").toString(),
//            sellerMap.get("address").toString(),
//            sellerMap.get("email").toString(),
//            sellerMap.get("managerName").toString(),
//            sellerMap.get("skype").toString(),
//            sellerMap.get("login").toString(),
//            sellerMap.get("password").toString()
//            );
        Seller seller = new Seller(
                sellerMap.get("login").toString(),
                sellerMap.get("password").toString()
        );
        srepository.save(seller);

        Map<String, Object> response = new LinkedHashMap<String, Object>();
        response.put("message", "Seller created successfully");
        response.put("seller", seller);
        return response;
        }

        @RequestMapping(method = RequestMethod.GET, value="{/sellerId}")
    public Seller getSellerDetails(@PathVariable("sellerId") String sellerId){
            return srepository.findOne(sellerId);
        }

        @RequestMapping(method = RequestMethod.PUT, value="{/sellerId}")
    public Map<String, Object> editSeller(@PathVariable("sellerId") String sellerId, @RequestBody Map<String, Object> sellerMap){
//            Seller seller = new Seller(sellerMap.get("passport").toString(),
//                    sellerMap.get("companyName").toString(),
//                    sellerMap.get("phone").toString(),
//                    sellerMap.get("address").toString(),
//                    sellerMap.get("email").toString(),
//                    sellerMap.get("managerName").toString(),
//                    sellerMap.get("skype").toString(),
//                    sellerMap.get("login").toString(),
//                    sellerMap.get("password").toString()
//            );
            Seller seller = new Seller(
                    sellerMap.get("login").toString(),
                    sellerMap.get("password").toString()
            );
            seller.setId(sellerId);

            Map<String, Object> response = new LinkedHashMap<String, Object>();
            response.put("message", "Seller updated successfully");
            response.put("seller", srepository.save(seller));
            return response;
        }

        @RequestMapping(method = RequestMethod.DELETE, value = "{/selerId}")
        public Map<String, Object> deleteSeller(@PathVariable("sellerId") String sellerId){
            srepository.delete(sellerId);
            Map<String, Object> response = new HashMap<String, Object>();
            response.put("message", "Seller deleted successfully");
            return response;
        }

        @RequestMapping(method = RequestMethod.GET)
    public Map<String, Object> getAllSellers(){
            List<Seller> sellers = srepository.findAll();
            Map<String, Object> response = new LinkedHashMap<String, Object>();
            response.put("total sellers", sellers.size());
            response.put("sellers", sellers);
            return response;
        }



}
