package repository;

import domain.ShoppingList;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ShoppingListRepository implements PanacheRepository<ShoppingList> {

}
