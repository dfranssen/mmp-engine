/*
 * Copyright 2015 Dirk Franssen.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ditavision.messengerengine.mmp.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dirk Franssen
 */
@XmlRootElement(name = "verifyRegistration")
@XmlAccessorType(XmlAccessType.FIELD)
public class MMPVerification {
    @XmlAttribute private String msisdn;
    @XmlAttribute private String pincode;

    public MMPVerification() {
    }

    public MMPVerification(String msisdn, String pincode) {
        this.msisdn = msisdn;
        this.pincode = pincode;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "MMPVerification{" + "msisdn=" + msisdn + ", pincode=" + pincode + '}';
    }
}
