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

package org.apache.kylin.rest.request;

import java.util.LinkedHashMap;

/**
 */
public class UpdateProjectRequest {
    private String formerProjectName;
    private String newProjectName;
    private String newDescription;
    private LinkedHashMap<String, String> overrideKylinProps;

    public UpdateProjectRequest() {
    }

    public String getFormerProjectName() {
        return formerProjectName;
    }

    public void setFormerProjectName(String formerProjectName) {

        this.formerProjectName = formerProjectName;
    }

    public String getNewDescription() {
        return newDescription;
    }

    public void setNewDescription(String newDescription) {
        this.newDescription = newDescription;
    }

    public String getNewProjectName() {
        return newProjectName;
    }

    public void setNewProjectName(String newProjectName) {
        this.newProjectName = newProjectName;
    }

    public LinkedHashMap<String, String> getOverrideKylinProps() {
        return overrideKylinProps;
    }

    public void setOverrideKylinProps(LinkedHashMap<String, String> overrideKylinProps) {
        this.overrideKylinProps = overrideKylinProps;
    }
}
