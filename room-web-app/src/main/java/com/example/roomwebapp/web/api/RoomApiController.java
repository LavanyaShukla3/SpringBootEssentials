package com.example.roomwebapp.web.api;

import com.example.roomwebapp.service.RoomService;
import com.example.roomwebapp.web.model.Room;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/rooms")
public class  RoomApiController {
    private final RoomService roomService;

    public RoomApiController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<Room> getAll() {
        return this.roomService.getAllRooms();
    }

    @GetMapping("/{id}")
    public Room getRoom(@PathVariable UUID id) {
        return this.roomService.getRoomById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Room addRoom(@RequestBody Room room) {
        return this.roomService.addRoom(room);
    }

    @PutMapping("/{id}")
    public Room updateRoom(@PathVariable UUID id, @RequestBody Room room) {
        room.setId(id); // important!
        return this.roomService.updateRoom(room);
    }

    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable UUID id) {
        this.roomService.deleteRoom(id);
    }
}
