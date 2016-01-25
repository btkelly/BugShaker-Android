/**
 * Copyright 2016 Stuart Kent
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.github.stkent.bugshaker;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;

import rx.Observable;

final class BasicScreenShotProvider extends BaseScreenshotProvider {

    BasicScreenShotProvider(@NonNull final Context applicationContext) {
        super(applicationContext);
    }

    @NonNull
    @Override
    protected Observable<Bitmap> getScreenshotBitmap(@NonNull final Activity activity) {
//        try {
//            callback.onSuccess(createBitmapOfNonMapViews(activity));
//        } catch (final InvalidActivitySizeException e) {
//            Logger.printStackTrace(e);
//            callback.onFailure();
//        }
    }

}
