package com.Stock.produt.itemService;

import com.Stock.produt.item.Item;
import com.Stock.produt.itemDto.ItemDto;
import com.Stock.produt.itemRepository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    //Add new Intem
    public Item addItem(ItemDto itemDto){
        Item item = new Item();

        item.setName(itemDto.getName());
        item.setValue(itemDto.getValue());
        item.setExpirationDate(itemDto.getExpirationDate());
        item.setLocalDate(itemDto.getLocalDate());

        return itemRepository.save(item);
    }

    //List intem
    public List<Item> getAllItem (){
        return itemRepository.findAll();
    }
}
