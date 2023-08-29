package com.example.jpa_and_hibernate.citizen.spring_data_jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public interface CitizenSpringDataJpaRepository extends JpaRepository<Citizen, Long> {

	// <Derived Methods>

	List<Citizen> findByName(String name);

	// for delete methods we need to use @Transactional
	@Transactional
	void deleteByName(String name);

	boolean existsByPanNo(String pan);

	//EntityManager getEntityManager();

	/*
	 * @Override default <S extends Citizen> S save(S entity) {
	 * 
	 * if (getEntityManager().contains(entity)) { throw new
	 * EntityExistsException("Entity with the aadhar no " + entity.getAadharNo() +
	 * "already exists"); } getEntityManager().persist(entity);
	 * 
	 * return entity; }
	 */

	default Citizen addCitizen(Citizen citizen) {
		if (existsById(citizen.getAadharNo())) {
			throw new EntityExistsException("Entity with Aadhar no " + citizen.getAadharNo() + " Already Exists");
		}
		return save(citizen);
	}

}
