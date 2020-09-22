package com.example.postsBackEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "api/vi")
public class PostController {
    private PostRepo postRepo;
    @Autowired
    public PostController(PostRepo postRepo) {
        this.postRepo = postRepo;
    }
    private List<Post> data= new ArrayList<>(
            Arrays.asList(
                    new Post("first","ahmed","dsd"),
                    new Post("second","mohamed","dsd"),
                    new Post("third","yasser","dsd"),
                    new Post("dsad","dasd","dsd")
            )
    );
    @GetMapping("/show")
    public List<Post> getAll(){
        return data;
    }
    @PostMapping("/")
    public PostModel inser(@RequestBody PostModel postModel){
        return postRepo.save(new PostModel(postModel.getId(),postModel.getTitle()));
    }
}
