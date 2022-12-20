/**
 * 
 */
package com.acheron.mobilestore.repository;

import org.springframework.stereotype.Repository;

import com.acheron.mobilestore.model.Mobile;
import com.arangodb.springframework.repository.ArangoRepository;

/**
 * @author BhargavRajJinka
 *
 */
@Repository
public interface IMobileRepository extends ArangoRepository<Mobile, Integer>{

}
