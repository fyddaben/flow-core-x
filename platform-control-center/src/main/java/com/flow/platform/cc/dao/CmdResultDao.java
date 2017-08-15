/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flow.platform.cc.dao;

import com.flow.platform.core.dao.BaseDao;
import com.flow.platform.domain.CmdResult;

import java.util.Collection;
import java.util.List;

/**
 * @author Will
 */
public interface CmdResultDao extends BaseDao<String, CmdResult> {

    /**
     * List cmd result by ids
     */
    List<CmdResult> list(Collection<String> cmdIds);

    /**
     * Only update not null fields or empty collection
     */
    int updateNotNullOrEmpty(CmdResult obj);
}
