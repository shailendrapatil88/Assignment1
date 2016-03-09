# Assignment1

Section 1:
-------
Added TopItemManager class to handle item click events and for sending callbacks using ItemClickListener interface.
This view consist of HorizontalScrollView and buttons as a childs.

Section 2:
-------
For this section I have used viewpager and radio group. And also loading PagerFragmnet for each page using PagerAdapter(subclass of FragmentPagerAdapter).
ViewPager.OnPageChangeListener added to listen swipe actions and to change radio group check position as per page position.
And each fragments view OnClickListener added and whenever user click on fragment it gives callback event to MainActivity using PagerFragment.OnFragmentInteractionListener interface.
It calls onFragmentClick(int number); method with fragment number.
I have added background colors to fragments so that we can see the pagers swiped items.

Section 3:
-------
This section has one RelativeLayout consisting 3 TextView with different properties. 
TextView 1 properties:
-----
```XML
android:layout_alignParentLeft="true"
android:layout_alignParentStart="true"
android:layout_alignParentTop="true"
```
  TextView 2 properties:
-----
```XML
android:layout_centerHorizontal="true"
android:layout_centerVertical="true"
```
  TextView 3 properties:
-----
```XML  
android:layout_alignParentBottom="true"
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
```
Section 4:
-------
This section has only one TextView which is used to show which itemhas clicked on Section 1.
This is achieved using interface callback method onItemClick(String name); (interface TopItemManager.ItemClickListener)

Section 5:
-------
It consist LinearLayout (horizontal) with gravivty center and 3 buttons with weight 1 for each.
Buttons has onClickListener to handle click events, It changes the background color of its parent to RED, GREEN, BLUE.
  
