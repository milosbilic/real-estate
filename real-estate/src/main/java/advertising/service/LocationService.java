package advertising.service;

import java.util.List;
import java.util.Optional;

import advertising.model.Location;

public interface LocationService {
	
	Location save(Location location);

	Location findOne(Long id);
	
	Optional<Location> findByName(String name);

	List<Location> findByNameStartingWith(String name);
	
}
