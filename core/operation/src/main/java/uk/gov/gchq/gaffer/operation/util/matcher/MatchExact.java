/*
 * Copyright 2018 Crown Copyright
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

package uk.gov.gchq.gaffer.operation.util.matcher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchExact implements Matcher {

    @Override
    public Map matching(final List input, final Object testObj) {
        Map results = new HashMap<>();

        if (input.contains(testObj)) {
            results.put(testObj, testObj);
        }

        return results;
    }
}
