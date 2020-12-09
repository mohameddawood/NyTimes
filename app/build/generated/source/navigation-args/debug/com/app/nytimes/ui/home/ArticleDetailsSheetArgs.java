package com.app.nytimes.ui.home;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.app.nytimes.model.entities.ArticlesResponse;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ArticleDetailsSheetArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ArticleDetailsSheetArgs() {
  }

  private ArticleDetailsSheetArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ArticleDetailsSheetArgs fromBundle(@NonNull Bundle bundle) {
    ArticleDetailsSheetArgs __result = new ArticleDetailsSheetArgs();
    bundle.setClassLoader(ArticleDetailsSheetArgs.class.getClassLoader());
    if (bundle.containsKey("article")) {
      ArticlesResponse article;
      if (Parcelable.class.isAssignableFrom(ArticlesResponse.class) || Serializable.class.isAssignableFrom(ArticlesResponse.class)) {
        article = (ArticlesResponse) bundle.get("article");
      } else {
        throw new UnsupportedOperationException(ArticlesResponse.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (article == null) {
        throw new IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("article", article);
    } else {
      throw new IllegalArgumentException("Required argument \"article\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public ArticlesResponse getArticle() {
    return (ArticlesResponse) arguments.get("article");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ArticleDetailsSheetArgs that = (ArticleDetailsSheetArgs) object;
    if (arguments.containsKey("article") != that.arguments.containsKey("article")) {
      return false;
    }
    if (getArticle() != null ? !getArticle().equals(that.getArticle()) : that.getArticle() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getArticle() != null ? getArticle().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ArticleDetailsSheetArgs{"
        + "article=" + getArticle()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ArticleDetailsSheetArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull ArticlesResponse article) {
      if (article == null) {
        throw new IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("article", article);
    }

    @NonNull
    public ArticleDetailsSheetArgs build() {
      ArticleDetailsSheetArgs result = new ArticleDetailsSheetArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setArticle(@NonNull ArticlesResponse article) {
      if (article == null) {
        throw new IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("article", article);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public ArticlesResponse getArticle() {
      return (ArticlesResponse) arguments.get("article");
    }
  }
}
