package com.app.nytimes.ui.home;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.app.nytimes.R;
import com.app.nytimes.model.entities.ArticlesResponse;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static ActionHomeFragmentToArticleDetailsFragmnet actionHomeFragmentToArticleDetailsFragmnet(
      @NonNull ArticlesResponse article) {
    return new ActionHomeFragmentToArticleDetailsFragmnet(article);
  }

  public static class ActionHomeFragmentToArticleDetailsFragmnet implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHomeFragmentToArticleDetailsFragmnet(@NonNull ArticlesResponse article) {
      if (article == null) {
        throw new IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("article", article);
    }

    @NonNull
    public ActionHomeFragmentToArticleDetailsFragmnet setArticle(
        @NonNull ArticlesResponse article) {
      if (article == null) {
        throw new IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("article", article);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("article")) {
        ArticlesResponse article = (ArticlesResponse) arguments.get("article");
        if (Parcelable.class.isAssignableFrom(ArticlesResponse.class) || article == null) {
          __result.putParcelable("article", Parcelable.class.cast(article));
        } else if (Serializable.class.isAssignableFrom(ArticlesResponse.class)) {
          __result.putSerializable("article", Serializable.class.cast(article));
        } else {
          throw new UnsupportedOperationException(ArticlesResponse.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_homeFragment_to_articleDetailsFragmnet;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public ArticlesResponse getArticle() {
      return (ArticlesResponse) arguments.get("article");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToArticleDetailsFragmnet that = (ActionHomeFragmentToArticleDetailsFragmnet) object;
      if (arguments.containsKey("article") != that.arguments.containsKey("article")) {
        return false;
      }
      if (getArticle() != null ? !getArticle().equals(that.getArticle()) : that.getArticle() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getArticle() != null ? getArticle().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToArticleDetailsFragmnet(actionId=" + getActionId() + "){"
          + "article=" + getArticle()
          + "}";
    }
  }
}
