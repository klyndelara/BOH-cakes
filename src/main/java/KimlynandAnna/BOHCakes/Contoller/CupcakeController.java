package KimlynandAnna.BOHCakes.Contoller;

import KimlynandAnna.BOHCakes.Dao.CupcakeDao;
import KimlynandAnna.BOHCakes.Models.Cupcake;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cupcakes")
public class CupcakeController {



    private CupcakeDao cupcakeDao;
    public CupcakeController (CupcakeDao cupcakeDao){

        this.cupcakeDao = cupcakeDao;
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Cupcake> getCupcakes() {
        return cupcakeDao.getCupcakes();
    }
}
