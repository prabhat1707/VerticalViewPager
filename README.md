# VerticalViewPager
A Vertical ViewPager Like InShorts App https://goo.gl/TYjZxm and trenzlr app https://goo.gl/mGr47N
just swipe up or down to go to next or prev page and it has also zoom In and Zoom out animation.

![alt tag](https://goo.gl/Qe1tHc)

## Step 1:  Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  ## Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.prabhat1707:VerticalViewPager:1.0'
	}
  
  # Usage
 ```
  <com.prabhat1707.verticalpager.VerticalViewPager
        android:id="@+id/viewPager"
        android:background="#000000"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
    </com.prabhat1707.verticalpager.VerticalViewPager>
  ```
  
  # License
  ```
 Copyright [2018] [prabhat rai]
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   ```
