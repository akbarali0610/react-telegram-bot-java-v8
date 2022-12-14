package uz.akbarali.foodappjavav8.projection;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public interface CategoryProductBotProjection extends IdProjection {
    String getName();

//    @Value("#{@productRepository.getAllFood(target.id)}")
//    List<ProductProjection> getProducts();
    @Value("#{@productServiceImpl.allFoods(target.foods)}")
    List<ProductCardProjection> getFoods();
}
