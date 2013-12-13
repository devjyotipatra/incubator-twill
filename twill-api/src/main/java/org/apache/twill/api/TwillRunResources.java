/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.twill.api;

/**
 * Information about the container the {@link TwillRunnable}
 * is running in.
 */
public interface TwillRunResources {

  /**
   * @return instance id of the runnable.
   */
  int getInstanceId();

  /**
   * @return number of cores the runnable is allowed to use.  YARN must be at least v2.1.0 and
   *   it must be configured to use cgroups in order for this to be a reflection of truth.
   */
  int getVirtualCores();

  /**
   * @return amount of memory in MB the runnable is allowed to use.
   */
  int getMemoryMB();

  /**
   * @return the host the runnable is running on.
   */
  String getHost();

  /**
   * @return id of the container the runnable is running in.
   */
  String getContainerId();
}