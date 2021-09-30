package csci4050.bookstore.address;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("addressService")
public class AddressService {

	private AddressRepository addressRepository;
	
    @Autowired
    public AddressService(AddressRepository addressRepository) { 
      this.addressRepository = addressRepository;
    }
    
	public Address findById(Integer id) {
		return addressRepository.findAddressById(id);
	}
    
    
	public void saveAddress(Address address) {
		addressRepository.save(address);
	}



}