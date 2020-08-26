package com.example.smartspring.repository;



import org.springframework.data.jpa.repository.JpaRepository;



import com.example.smartspring.model.PegawaiModel;

public interface PegawaiRepository extends JpaRepository<PegawaiModel, String>{
	
	/*
	 * //JPQL
	 * 
	 * @Query("select p from PasienModel p order by p.namaPasien desc")
	 * List<PasienModel> pasien();
	 */
	
}
