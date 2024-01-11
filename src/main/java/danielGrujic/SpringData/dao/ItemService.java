package danielGrujic.SpringData.dao;

import danielGrujic.SpringData.Entities.Drink;
import danielGrujic.SpringData.Entities.Item;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ItemService {
    @Autowired
    private ItemDAO itemDAO;

    public void saveItem(Item item) {
        if (item.getName().length() < 2) throw new RuntimeException("Il nome è troppo corto");

        itemDAO.save(item);
        System.out.println("Item salvato" + item);

    }

}
