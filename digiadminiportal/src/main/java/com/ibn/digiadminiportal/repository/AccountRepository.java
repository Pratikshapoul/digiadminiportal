package com.ibn.digiadminiportal.repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibn.digiadminiportal.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository <Account , Long >  {
	
	@Query (value = "select * from account where owner like %?1%", nativeQuery =  true)
	List<Account> findAccountsByOwner (String ownerKeyword);
	
	
	

}
