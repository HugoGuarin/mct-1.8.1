/*******************************************************************************
 * Mission Control Technologies, Copyright (c) 2009-2012, United States Government
 * as represented by the Administrator of the National Aeronautics and Space 
 * Administration. All rights reserved.
 *
 * The MCT platform is licensed under the Apache License, Version 2.0 (the 
 * "License"); you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations under 
 * the License.
 *
 * MCT includes source code licensed under additional open source licenses. See 
 * the MCT Open Source Licenses file included with this distribution or the About 
 * MCT Licenses dialog available at runtime from the MCT Help menu for additional 
 * information. 
 *******************************************************************************/
package org.acme.example.telemetry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class serves as an example to demonstrate some simple metadta to keep for the telemetry. This is expected to be
 * extended to preserve more metadata. 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TelemetryData {
	private String telemetryId;
	private String telemetryDescription;
	
	public void setId(String telemetryId) {
		this.telemetryId = telemetryId;
	}
	public String getId() {
		return telemetryId;
	}
	
	public void setDescription(String telemetryDescription) {
		this.telemetryDescription = telemetryDescription;
	}
	public String getDescription() {
		return telemetryDescription;
	}
	
	
}