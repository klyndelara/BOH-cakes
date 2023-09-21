package KimlynandAnna.BOHCakes.Dao;

import KimlynandAnna.BOHCakes.Models.Cupcake;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class JdbcCupcakeDao implements CupcakeDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcCupcakeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Cupcake> getCupcakes() {
        List<Cupcake> cupcakes = new ArrayList<>();
        String cupcakeSql = "Select * FROM cupcake;";
        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(cupcakeSql);
            while (results.next()) {
                Cupcake cupcake = mapRowToCupcake(results);
                cupcakes.add(cupcake);

            }


        } catch (CannotGetJdbcConnectionException e) {

            System.out.println(e.getMessage());


        }
        return cupcakes;
    }

    private Cupcake mapRowToCupcake(SqlRowSet rowSet) {
        Cupcake cupcake = new Cupcake();
        cupcake.setCupcakeId(rowSet.getInt("cupcake_id"));
        cupcake.setName(rowSet.getString("name"));
        cupcake.setDescription(rowSet.getString("description"));
        cupcake.setCost(rowSet.getString("cost"));
        return cupcake;
    }
}
