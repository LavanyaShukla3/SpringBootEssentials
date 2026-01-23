package com.example.roomwebapp.web.controller;

import com.example.roomwebapp.data.repository.RoomRepository;
import com.example.roomwebapp.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/rooms")
    public String getRooms(Model model) {
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";  // NOT rooms.html
    }
}
