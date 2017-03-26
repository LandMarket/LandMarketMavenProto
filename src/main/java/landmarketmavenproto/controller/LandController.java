package landmarketmavenproto.controller;

import landmarketmavenproto.model.Land;
import landmarketmavenproto.repository.LandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/land")
public class LandController {
    @Autowired
    LandRepository lrepository;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String, Object> createLand(@RequestBody Map<String, Object> landMap){
        Land land = new Land(landMap.get("area").toString(),
                landMap.get("assingment").toString());
        lrepository.save(land);

        Map<String, Object> response = new LinkedHashMap<String, Object>();
        response.put("message", "land created successfully");
        response.put("land", land);
        return response;
    }

    @RequestMapping(method = RequestMethod.GET, value = "{/landId}")
    public Land getLandDetails(@PathVariable("landId") String landId) {
        return lrepository.findOne(landId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{/landId}")
    public Map<String, Object> editLand(@PathVariable("landId") String landId, @RequestBody Map<String, Object> landMap){
        Land land = new Land(landMap.get("area").toString(),
                landMap.get("assingment").toString());
        land.setId(landId);

        Map<String, Object> response = new LinkedHashMap<String, Object>();
        response.put("message", "land updates successfully");
        response.put("land", lrepository.save(land));
        return response;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{/landId}")
        public Map<String, Object> deleteLand(@PathVariable("landId") String landId){
        lrepository.delete(landId);
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("message", "land deleted successfully");
        return response;
    }

    @RequestMapping(method = RequestMethod.GET)
         public Map<String, Object> getAllLand(){
         List<Land> lands = lrepository.findAll();
         Map<String, Object> response = new LinkedHashMap<String, Object>();
         response.put("lands", lands.size());
         response.put("lands", lands);
         return response;
    }

}
