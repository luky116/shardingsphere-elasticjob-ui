/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.elasticjob.lite.ui.dao.statistics;

import org.apache.shardingsphere.elasticjob.lite.ui.domain.JobRegisterStatistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Job register statistics repository.
 */
@Repository
public interface JobRegisterStatisticsRepository extends JpaRepository<JobRegisterStatistics, Long> {
    
    /**
     * Find job register statistics.
     *
     * @param fromTime from date to statistics
     * @return job register statistics
     */
    @Query("FROM JobRegisterStatistics WHERE statisticsTime >= :fromTime")
    List<JobRegisterStatistics> findJobRegisterStatistics(@Param("fromTime") Date fromTime);
}
