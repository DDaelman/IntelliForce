/*
 * Copyright 2014 Mark Borner
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package au.com.borner.salesforce.client.rest.domain;

import org.json.JSONException;

/**
 * @author mark
 */
public class DescribeField extends AbstractJSONObject {

    public DescribeField(String string) throws JSONException {
        super(string);
    }

    public String getName() {
        return getString("name");
    }

    public Integer getLength() {
        return getInt("length");
    }

    public String getLabel() {
        return getString("label");
    }

    public Boolean isUnique() {
        return getBoolean("unique");
    }
}
