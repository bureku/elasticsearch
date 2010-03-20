/*
 * Licensed to Elastic Search and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Elastic Search licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.action.search;

/**
 * A failure during a reduce phase (when receiving results from several shards, and reducing them
 * into one or more results and possible actions).
 *
 * @author kimchy (shay.banon)
 */
public class ReduceSearchPhaseException extends SearchPhaseExecutionException {

    public ReduceSearchPhaseException(String phaseName, String msg, ShardSearchFailure[] shardFailures) {
        super(phaseName, "[reduce] " + msg, shardFailures);
    }

    public ReduceSearchPhaseException(String phaseName, String msg, Throwable cause, ShardSearchFailure[] shardFailures) {
        super(phaseName, "[reduce] " + msg, cause, shardFailures);
    }
}
