package za.ac.cput.factory;

import za.ac.cput.domain.ReturnTruck;
import za.ac.cput.util.Helper;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * ReturnTruckFactory.java
 * This is the Factory program
 * @author Thandolwethu Khoza (221797289)
 * Date: 21 March 2024
 */

public class ReturnTruckFactory {
    public static ReturnTruck buildReturnTruck(String returnID, int rentalID, double overdueAmount, LocalDate dateReturn, LocalTime timeReturn) {
        if (Helper.isNullOrEmpty(returnID) || Helper.isNullOrEmpty(String.valueOf(rentalID)) || Helper.isNullOrEmpty(String.valueOf(overdueAmount))
                || Helper.isNullOrEmpty(String.valueOf(dateReturn)) ||  Helper.isNullOrEmpty(String.valueOf(timeReturn)))
                return null;

        return new ReturnTruck.Builder().setReturnID(returnID).setRentalID(rentalID)
                .setOverdueAmount(overdueAmount).setDateReturn(dateReturn).setTimeReturn(LocalTime.from(timeReturn)).build();
    }
    public static ReturnTruck buildReturnTruck3(int rentalID, double overdueAmount, LocalDate dateReturn) {
        if (Helper.isNullOrEmpty(String.valueOf(rentalID)) || Helper.isNullOrEmpty(String.valueOf(overdueAmount))
                || Helper.isNullOrEmpty(String.valueOf(dateReturn)))
            return null;

        String returnID =(Helper.generateId());

        return new ReturnTruck.Builder().setReturnID(returnID).setRentalID(rentalID)
                .setOverdueAmount(overdueAmount).setDateReturn(dateReturn).build();
    }
}
