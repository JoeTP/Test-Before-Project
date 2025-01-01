/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Youssif
 */
public class DataAccessControlImpl implements DataAccessControl{

    @Override
    public boolean insert(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(User user) throws SQLException {
        System.out.println("The update method");
        //
        //
        //
        //
        //
        return false;
    }
    
}
