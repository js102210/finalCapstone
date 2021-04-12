package com.techelevator.dao;

import com.techelevator.model.Frosting;

import java.math.BigDecimal;
import java.util.List;

public interface FrostingDAO {
    /**
     * gets all Frostings that are available
     * @return List<Frostings> containing all Frostings available
     */
    List<Frosting> getAvailableFrostings();

    /**
     * gets all Frostings in database
     * @return List<Frosting> containing all Flavors from database
     */
    List<Frosting> getAllFrostings();

    /**
     * inserts a new Frosting in the datastore
     * @param frostingName String name of the Frosting
     * @param priceMod BigDecimal how much the Frosting
     * @return int ID of the newly created Frosting
     */
    int createFrosting(String frostingName, BigDecimal priceMod);
    int createFrosting(Frosting newFrosting);

    /**
     * changes the availability status of a Frosting
     * @param ID int ID of the Frosting to change availability for
     * @return boolean the availability status of the Frosting after the change
     */
    //note possibly change this
    boolean flipAvailability(int ID);

    /**
     * removes a Frosting from the datastore
     * @param ID int ID of the Frosting to delete
     * @return String confirmation that the Frosting was deleted (probably the name plus " was deleted."
     */
    String deleteFrosting(int ID);

    /**
     * make updates to an existing Frosting
     * @param frosting the frosting to change, with all updated properties
     * @param frosting of the frosting to change
     * @return Frosting with all properties updated
     */
    void update(Frosting frosting);
    void updateFrosting(Frosting frosting, int id);


}
