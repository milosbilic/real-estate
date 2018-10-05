package advertising.service;

import java.util.List;

import advertising.dto.SearchDto;
import advertising.model.Ad;

public interface AdService {

	List<Ad> findAll();
	
	Ad findOne(Long id);
	
	Ad save(Ad ad);
	
	void delete(Ad ad);
	
	List<Ad> findNewest();

	List<Ad> search(SearchDto searchDto);
	
}
