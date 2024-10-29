package com.friend_list.exercise3.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.friend_list.exercise3.domain.Friend;

@Controller
public class FriendList {
    // Declare friends as an instance variable
    private List<Friend> friends = new ArrayList<>();

    // Constructor to initialize the friend list
    public FriendList() {
        // Add initial friends
        friends.add(new Friend("Minna", "Minnanen"));
        friends.add(new Friend("Tanja", "Tanjanen"));
        friends.add(new Friend("Jukka", "Jukkanen"));
    }

    // Endpoint to display the list of friends
    @GetMapping("/friends")
    public String friendList(Model model) {
        // Add data to the model
        model.addAttribute("friendsMessage", "My Friends");
        model.addAttribute("friends", friends);
        return "friendlist";
    }

    // Endpoint to display the add friend form
    @GetMapping("/add")
    public String addFriends(Model model) {
        model.addAttribute("friend", new Friend());
        return "friendform";
    }

    // Simple endpoint to handle form submission
    @PostMapping("/add")
    public String submitfriendForm(@ModelAttribute Friend friend) {
        // Add the new friend to the list
        friends.add(friend);
        return "redirect:/friends";
    }
}
