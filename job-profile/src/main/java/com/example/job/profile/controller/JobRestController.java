package com.example.job.profile.controller;

import com.example.job.profile.model.JobPost;
import com.example.job.profile.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();

    }
    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable ("postId")int PostId){
        return service.getJob(postId);
    }


    @PostMapping("/jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());

    }

    public JobPost updateJob(@RequestBody jobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());

    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId){
        service.deleteJob(PostId);
        return "Deleted";
    }

}
