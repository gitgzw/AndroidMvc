/*
 * Copyright 2015 Kejun Xia
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

package com.shipdream.lib.android.mvc.view.lifecycle;

import com.shipdream.lib.android.mvc.view.BaseTestCase;
import com.shipdream.lib.android.mvp.view.lifecycle.MvpTestActivity;

public abstract class BaseTestCaseLifeCycle extends BaseTestCase <MvpTestActivity> {

    public BaseTestCaseLifeCycle() {
        super(MvpTestActivity.class);
    }

    @Override
    protected void waitTest() throws InterruptedException {
        waitTest(1500);
    }
}
