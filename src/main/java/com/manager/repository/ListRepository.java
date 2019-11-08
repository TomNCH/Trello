package com.manager.repository;

import com.manager.model.List;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ListRepository extends PagingAndSortingRepository<List, Long> {
}
