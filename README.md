PoppyView
==================

PoppyView is a library which implements view on the bottom which come and go relative to the user scroll. It can be seen in the Google plus app.

This library uses

* techniques outlined by Cyril Mottier in [a recent blog post][1].
* NineOldAndroids by Jake Wharton [here][2] (for reasons of backwards compatibility)
* ScrollTricks by Roman Nurik [here][3]

For reasons of backwards compatibility the sample relies on ActionBarSherlock.

![Example Image][4]

![Example Image][9]

Try out the sample APK [here][5]

Or browse the [source code of the sample application][6] for a complete example of use.

Including in your project
-------------------------

Just add the library to your application as a library project. And don't forget that your project must use NineOldAndroids.

Usage
---------

Using the library is simple, just look at the source code of the provided samples:

* [If your content is a `ScrollView`][7].
* [If your content is a `ListView`][8].


Acknowledgements
--------------------

* Thanks to Cyril Mottier, Roman Nurik and Jake Wharton

License
-----------

    Copyright 2013 Flavien Laurent

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
	
	
	

 [1]: http://cyrilmottier.com/2013/05/24/pushing-the-actionbar-to-the-next-level/
 [2]: http://nineoldandroids.com/
 [3]: https://code.google.com/p/romannurik-code/source/browse/misc/scrolltricks
 [4]: https://raw.github.com/biboune/poppyview/master/graphics/img1.png
 [9]: https://raw.github.com/biboune/poppyview/master/graphics/img2.png
 [5]: https://raw.github.com/biboune/poppyview/master/poppyview-sample.apk
 [6]: https://github.com/biboune/poppyview/tree/master/poppyview-sample
 [7]: https://github.com/biboune/poppyview/blob/master/poppyview-sample/src/com/fourmob/poppyview/sample/ScrollViewActivity.java
 [8]: https://github.com/biboune/poppyview/blob/master/poppyview-sample/src/com/fourmob/poppyview/sample/ListViewActivity.java
