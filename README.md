# VerticalViewPager
A Vertical ViewPager Like InShorts App https://goo.gl/TYjZxm and trenzlr app https://goo.gl/mGr47N
just swipe up or down to go to next or prev page and it has also zoom In and Zoom out animation.

![alt tag](https://goo.gl/Qe1tHc)

# Step 1:  Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  # Step 2. Add the dependency

	dependencies {
	        compile 'com.github.prabhat1707:VerticalViewPager:1.0'
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
