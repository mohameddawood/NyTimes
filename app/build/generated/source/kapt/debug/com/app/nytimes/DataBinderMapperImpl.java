package com.app.nytimes;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.app.nytimes.databinding.ActivityMainBindingImpl;
import com.app.nytimes.databinding.ArticleDetailsSheetBindingImpl;
import com.app.nytimes.databinding.FragmentSplashBindingImpl;
import com.app.nytimes.databinding.ItemArticleBindingImpl;
import com.app.nytimes.databinding.LayoutErrorBindingImpl;
import com.app.nytimes.databinding.LayoutNoConnectionBindingImpl;
import com.app.nytimes.databinding.LayoutSuccessBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ARTICLEDETAILSSHEET = 2;

  private static final int LAYOUT_FRAGMENTSPLASH = 3;

  private static final int LAYOUT_ITEMARTICLE = 4;

  private static final int LAYOUT_LAYOUTERROR = 5;

  private static final int LAYOUT_LAYOUTNOCONNECTION = 6;

  private static final int LAYOUT_LAYOUTSUCCESS = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.nytimes.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.nytimes.R.layout.article_details_sheet, LAYOUT_ARTICLEDETAILSSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.nytimes.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.nytimes.R.layout.item_article, LAYOUT_ITEMARTICLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.nytimes.R.layout.layout_error, LAYOUT_LAYOUTERROR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.nytimes.R.layout.layout_no_connection, LAYOUT_LAYOUTNOCONNECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.nytimes.R.layout.layout_success, LAYOUT_LAYOUTSUCCESS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ARTICLEDETAILSSHEET: {
          if ("layout/article_details_sheet_0".equals(tag)) {
            return new ArticleDetailsSheetBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for article_details_sheet is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMARTICLE: {
          if ("layout/item_article_0".equals(tag)) {
            return new ItemArticleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_article is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTERROR: {
          if ("layout/layout_error_0".equals(tag)) {
            return new LayoutErrorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_error is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTNOCONNECTION: {
          if ("layout/layout_no_connection_0".equals(tag)) {
            return new LayoutNoConnectionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_no_connection is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSUCCESS: {
          if ("layout/layout_success_0".equals(tag)) {
            return new LayoutSuccessBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_success is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "adapter");
      sKeys.put(2, "article");
      sKeys.put(3, "clickListener");
      sKeys.put(4, "response");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_main_0", com.app.nytimes.R.layout.activity_main);
      sKeys.put("layout/article_details_sheet_0", com.app.nytimes.R.layout.article_details_sheet);
      sKeys.put("layout/fragment_splash_0", com.app.nytimes.R.layout.fragment_splash);
      sKeys.put("layout/item_article_0", com.app.nytimes.R.layout.item_article);
      sKeys.put("layout/layout_error_0", com.app.nytimes.R.layout.layout_error);
      sKeys.put("layout/layout_no_connection_0", com.app.nytimes.R.layout.layout_no_connection);
      sKeys.put("layout/layout_success_0", com.app.nytimes.R.layout.layout_success);
    }
  }
}
