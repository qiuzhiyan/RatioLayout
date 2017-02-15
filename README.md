# RatioLayout
按照比例展示宽高的自定义控件，可以按照imageview的原始比例存放，代码简单，不丢失任何原始图片数据

具体使用，可以看Demo


<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:Ratio="http://schemas.android.com/apk/res/com.example.ratinglayout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical" >

    <com.example.ratinglayout.RatioLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        Ratio:ratio="2.43"
        android:padding="5dp" >

        <ImageView
            android:id="@+id/iv_pic"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:scaleType="fitXY" />
    </com.example.ratinglayout.RatioLayout>

</LinearLayout>
