/*
 * Copyright (C) 2010-2014 Hamburg Sud and the contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.aludratest.service.gitclient.data;

import org.aludratest.service.gitclient.GitClient;

/** Wraps data for the invocation of the {@link GitClient}'s push method.
 * @see GitClient#push(PushData)
 * @author Volker Bergmann */
public class PushData extends AbstractRefspecData {

    /** Public default constructor. */
    public PushData() {
        this(null, null);
    }

    /** Fully parameterized constructor.
     * @param repository the repository
     * @param refspec the refspec */
    public PushData(String repository, String refspec) {
        super(repository, refspec);
    }

}
