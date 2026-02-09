package com.example.job.profile.service;


import com.example.job.profile.model.JobPost;
import com.example.job.profile.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    public JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJobPost(jobPost);


    }

    public List<JobPost>getAllJobs(){
        return repo.getAllJobs();

    }

    public void update(JobPost jobPost){
        repo.updateJob(jobPost);
    }

    public void deleteJob(int postId){
        repo.deleteJob(postId);
    }


}
