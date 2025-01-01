/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

import java.sql.SQLException;

/**
 *
 * @author Youssif
 */
public class DataAccessControlImpl implements DataAccessControl{
     
        public boolean delete(User user) throws SQLException{
            System.out.println("Implementation of Delete Function,,,,");
            System.out.println("Implementation of Delete Function,,,,");
            System.out.println("Implementation of Delete Function,,,,");
            System.out.println("Implementation of Delete Function,,,,");
            System.out.println("AY");
            return false;
        };

    @Override
    public boolean insert(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
