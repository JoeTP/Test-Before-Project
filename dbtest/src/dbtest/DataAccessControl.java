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
public interface DataAccessControl {
    boolean insert(User user);
    
    default public boolean update(User user) throws SQLException {return false;}; 
    
    default boolean delete(User user) throws SQLException{return false;};
    
    default User firstRecord() throws SQLException {return null;};
    
}
