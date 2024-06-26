package za.ac.cput.repository;

import za.ac.cput.domain.ReturnTruck;
import java.util.List;

/**
 * IReturnTruckRepository.java
 * This is the repository interface
 * @author Thandolwethu Khoza (221797289)
 * Date: 24 March 2024
 */

public interface IReturnTruckRepository extends IRepository<ReturnTruck,String> {
    List<ReturnTruck> getAll();

}
