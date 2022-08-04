/*
 * Copyright (C) 2022 Project Kaleidoscope
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

package org.exthmui.settings.fragments.statusbar;

import android.app.settings.SettingsEnums;
import android.os.Bundle;

import androidx.preference.Preference;

import org.exthmui.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class StatusbarLyric extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        addPreferencesFromResource(R.xml.statusbar_lyric);
    }

    @Override
    public int getMetricsCategory() {
        return SettingsEnums.STATUS_BAR_LYRIC;
    }
}
