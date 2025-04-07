package com.paf_assignment.paf_assignment.Repository;

import com.paf_assignment.paf_assignment.Model.Progress;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProgressRepo extends MongoRepository<Progress,String>{



}
