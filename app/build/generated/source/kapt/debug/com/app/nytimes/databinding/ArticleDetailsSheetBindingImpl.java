package com.app.nytimes.databinding;
import com.app.nytimes.R;
import com.app.nytimes.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ArticleDetailsSheetBindingImpl extends ArticleDetailsSheetBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imgBack, 6);
        sViewsWithIds.put(R.id.tv_page_title, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ArticleDetailsSheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ArticleDetailsSheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            );
        this.ivArticle.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvArticleAuthor.setTag(null);
        this.tvArticleDetails.setTag(null);
        this.tvArticleName.setTag(null);
        this.tvDate.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.article == variableId) {
            setArticle((com.app.nytimes.model.entities.ArticlesResponse) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setArticle(@Nullable com.app.nytimes.model.entities.ArticlesResponse Article) {
        this.mArticle = Article;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.article);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean articleSourceJavaLangObjectNull = false;
        java.lang.String articleSourceJavaLangObjectNullJavaLangStringArticleSource = null;
        java.lang.String articleTitle = null;
        com.app.nytimes.model.entities.ArticlesResponse.Media.MediaMetadata articleMediaGetInt0MediaMetadataGetInt0 = null;
        boolean articleTitleJavaLangObjectNull = false;
        boolean articlePublishedDateJavaLangObjectNull = false;
        java.util.List<com.app.nytimes.model.entities.ArticlesResponse.Media> articleMedia = null;
        java.lang.String articleSource = null;
        com.app.nytimes.model.entities.ArticlesResponse.Media articleMediaGetInt0 = null;
        java.lang.String articleTitleJavaLangObjectNullJavaLangStringArticleTitle = null;
        java.lang.String articleMediaGetInt0MediaMetadataGetInt0Url = null;
        java.lang.String articlePublishedDateJavaLangObjectNullJavaLangStringArticlePublishedDate = null;
        java.lang.String articleMediaGetInt0Caption = null;
        java.util.List<com.app.nytimes.model.entities.ArticlesResponse.Media.MediaMetadata> articleMediaGetInt0MediaMetadata = null;
        com.app.nytimes.model.entities.ArticlesResponse article = mArticle;
        java.lang.String articlePublishedDate = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (article != null) {
                    // read article.title
                    articleTitle = article.getTitle();
                    // read article.media
                    articleMedia = article.getMedia();
                    // read article.source
                    articleSource = article.getSource();
                    // read article.publishedDate
                    articlePublishedDate = article.getPublishedDate();
                }


                // read article.title == null
                articleTitleJavaLangObjectNull = (articleTitle) == (null);
                // read article.source == null
                articleSourceJavaLangObjectNull = (articleSource) == (null);
                // read article.publishedDate == null
                articlePublishedDateJavaLangObjectNull = (articlePublishedDate) == (null);
            if((dirtyFlags & 0x3L) != 0) {
                if(articleTitleJavaLangObjectNull) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(articleSourceJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(articlePublishedDateJavaLangObjectNull) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
                if (articleMedia != null) {
                    // read article.media.get(0)
                    articleMediaGetInt0 = articleMedia.get(0);
                }


                if (articleMediaGetInt0 != null) {
                    // read article.media.get(0).caption
                    articleMediaGetInt0Caption = articleMediaGetInt0.getCaption();
                    // read article.media.get(0).mediaMetadata
                    articleMediaGetInt0MediaMetadata = articleMediaGetInt0.getMediaMetadata();
                }


                if (articleMediaGetInt0MediaMetadata != null) {
                    // read article.media.get(0).mediaMetadata.get(0)
                    articleMediaGetInt0MediaMetadataGetInt0 = articleMediaGetInt0MediaMetadata.get(0);
                }


                if (articleMediaGetInt0MediaMetadataGetInt0 != null) {
                    // read article.media.get(0).mediaMetadata.get(0).url
                    articleMediaGetInt0MediaMetadataGetInt0Url = articleMediaGetInt0MediaMetadataGetInt0.getUrl();
                }
        }
        // batch finished

        if ((dirtyFlags & 0x3L) != 0) {

                // read article.source == null ? "" : article.source
                articleSourceJavaLangObjectNullJavaLangStringArticleSource = ((articleSourceJavaLangObjectNull) ? ("") : (articleSource));
                // read article.title == null ? "" : article.title
                articleTitleJavaLangObjectNullJavaLangStringArticleTitle = ((articleTitleJavaLangObjectNull) ? ("") : (articleTitle));
                // read article.publishedDate == null ? "" : article.publishedDate
                articlePublishedDateJavaLangObjectNullJavaLangStringArticlePublishedDate = ((articlePublishedDateJavaLangObjectNull) ? ("") : (articlePublishedDate));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.app.nytimes.model.entities.ArticlesResponseKt.loadImage(this.ivArticle, articleMediaGetInt0MediaMetadataGetInt0Url);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvArticleAuthor, articleSourceJavaLangObjectNullJavaLangStringArticleSource);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvArticleDetails, articleMediaGetInt0Caption);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvArticleName, articleTitleJavaLangObjectNullJavaLangStringArticleTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, articlePublishedDateJavaLangObjectNullJavaLangStringArticlePublishedDate);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): article
        flag 1 (0x2L): null
        flag 2 (0x3L): article.source == null ? "" : article.source
        flag 3 (0x4L): article.source == null ? "" : article.source
        flag 4 (0x5L): article.title == null ? "" : article.title
        flag 5 (0x6L): article.title == null ? "" : article.title
        flag 6 (0x7L): article.publishedDate == null ? "" : article.publishedDate
        flag 7 (0x8L): article.publishedDate == null ? "" : article.publishedDate
    flag mapping end*/
    //end
}