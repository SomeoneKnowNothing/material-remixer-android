/*
 * Copyright 2016 Google Inc.
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

package somepackage;

import com.google.android.libraries.remixer.ItemListRemix;
import com.google.android.libraries.remixer.Remix;
import com.google.android.libraries.remixer.RemixCallback;
import com.google.android.libraries.remixer.Remixer;
import com.google.android.libraries.remixer.annotation.RemixerBinder;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

/**
 * This class was generated by RemixerAnnotationProcessor */
class FixesDefaultValue_RemixerBinder extends RemixerBinder.Binder<FixesDefaultValue> {
  @Override
  public void bindInstance(FixesDefaultValue activity) {
    Remixer remixer;
    if (activity.remixer == null) {
      remixer = new Remixer();
    } else {
      remixer = activity.remixer;
    }
    ArrayList<String> fixValue_remix_list = new ArrayList<String>();
    fixValue_remix_list.add("hello");
    fixValue_remix_list.add("world");
    Generated_fixValue fixValue_callback = new Generated_fixValue(activity);
    ItemListRemix<String> fixValue_remix = new ItemListRemix<String>("fixValue", "fixValue", "hello", fixValue_remix_list, fixValue_callback, 0);
    remixer.addRemix(fixValue_remix);
    activity.remixer = remixer;
  }

  static class Generated_fixValue implements RemixCallback<String> {
    private final FixesDefaultValue activity;

    Generated_fixValue(FixesDefaultValue activity) {
      this.activity = activity;
    }

    @Override
    public void onValueSet(Remix<String> remix) {
      activity.fixValue(remix.getSelectedValue());
    }
  }
}