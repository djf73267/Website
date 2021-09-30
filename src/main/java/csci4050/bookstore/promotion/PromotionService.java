package csci4050.bookstore.promotion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("promotionService")
public class PromotionService {

	private PromotionRepository promotionRepository;
	
    @Autowired
    public PromotionService(PromotionRepository promotionRepository) { 
      this.promotionRepository = promotionRepository;
    }
	
	public List<Promotion> listAll() {
        return promotionRepository.findAll();
    }
	public Promotion findById(Integer id) {
		return promotionRepository.findPromotionById(id);
	}
	
	public Promotion findByPromoName(String promoName){
		return promotionRepository.findPromotionByPromoName(promoName);
	}

    
	public void savePromotion(Promotion promotion) {
		promotionRepository.save(promotion);
	}



}