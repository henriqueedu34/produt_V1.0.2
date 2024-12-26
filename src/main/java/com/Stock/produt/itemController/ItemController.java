package com.Stock.produt.itemController;

import com.Stock.produt.item.Item;
import com.Stock.produt.itemDto.ItemDto;
import com.Stock.produt.itemService.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {
    public final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public ResponseEntity<Item> addItem (@RequestBody ItemDto itemDto){
        Item addItem = itemService.addItem(itemDto);
        return new ResponseEntity<>(addItem, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Item>> getAllItem(){
        return ResponseEntity.ok(itemService.getAllItem());
    }
}
