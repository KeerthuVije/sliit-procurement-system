package lk.sliit.csse.procurementsystem.repositories;

import lk.sliit.csse.procurementsystem.models.Items;
import lk.sliit.csse.procurementsystem.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;
@NoRepositoryBean
public interface OrderRepository  <T extends Order> extends JpaRepository<T, String>{ 
     //   extends ItemsRepository<Order>  {
}
