package com.example.job.profile.repo;


import com.example.job.profile.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> jobs= new ArrayList<>();





    public List<JobPost>returnAllJobPosts(){
        return jobs;
    }
public void addJobPost(JobPost job){
        jobs.add(job);
    System.out.println(jobs);
}


    public List<JobPost> getAllJobs() {
        for(JobPost job: jobs){
            if(job.getPostId()==i)
                return job;

        }
        return null;


    }

    public void updateJob(JobPost jobPost) {
        for (JobPost job: jobs){
            if(job.getPostId()== jobPost.getPostId()){
                job.setPostProfile(jobPost.getPostProfile());
                job.setPostDesc(jobPost.getPostDesc());
                job.setReqExerience(jobPost.getReqExperience());
                job.setPostTechStack(jobPost.getPostTechStack());
            }
        }
    }

    public void deleteJob(int postId) {

        for(JobPost jobPost: jobs){
            if(JobPost.getPostId()== postId){
                jobs.remove(jobPost);
            }
        }
    }
}
