package com.app.nytimes.databinding;
import com.app.nytimes.R;
import com.app.nytimes.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemArticleBindingImpl extends ItemArticleBinding implements com.app.nytimes.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_article, 4);
        sViewsWithIds.put(R.id.iv_arrow, 5);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemArticleBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemArticleBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.layoutArticle.setTag(null);
        this.tvArticleAuthor.setTag(null);
        this.tvArticleDate.setTag(null);
        this.tvArticleName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.app.nytimes.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.response == variableId) {
            setResponse((com.app.nytimes.model.entities.ArticlesResponse) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((com.app.nytimes.ui.home.ArticlesAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setResponse(@Nullable com.app.nytimes.model.entities.ArticlesResponse Response) {
        this.mResponse = Response;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.response);
        super.requestRebind();
    }
    public void setAdapter(@Nullable com.app.nytimes.ui.home.ArticlesAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.adapter);
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
        java.lang.String responsePublishedDateJavaLangObjectNullJavaLangStringResponsePublishedDate = null;
        com.app.nytimes.model.entities.ArticlesResponse response = mResponse;
        java.lang.String responseSourceJavaLangObjectNullJavaLangStringResponseSource = null;
        boolean responseTitleJavaLangObjectNull = false;
        java.lang.String responseSource = null;
        java.lang.String responsePublishedDate = null;
        boolean responseSourceJavaLangObjectNull = false;
        boolean responsePublishedDateJavaLangObjectNull = false;
        com.app.nytimes.ui.home.ArticlesAdapter adapter = mAdapter;
        java.lang.String responseTitle = null;
        java.lang.String responseTitleJavaLangObjectNullJavaLangStringResponseTitle = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (response != null) {
                    // read response.source
                    responseSource = response.getSource();
                    // read response.publishedDate
                    responsePublishedDate = response.getPublishedDate();
                    // read response.title
                    responseTitle = response.getTitle();
                }


                // read response.source == null
                responseSourceJavaLangObjectNull = (responseSource) == (null);
                // read response.publishedDate == null
                responsePublishedDateJavaLangObjectNull = (responsePublishedDate) == (null);
                // read response.title == null
                responseTitleJavaLangObjectNull = (responseTitle) == (null);
            if((dirtyFlags & 0x5L) != 0) {
                if(responseSourceJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(responsePublishedDateJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(responseTitleJavaLangObjectNull) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x5L) != 0) {

                // read response.publishedDate == null ? "" : response.publishedDate
                responsePublishedDateJavaLangObjectNullJavaLangStringResponsePublishedDate = ((responsePublishedDateJavaLangObjectNull) ? ("") : (responsePublishedDate));
                // read response.source == null ? "" : response.source
                responseSourceJavaLangObjectNullJavaLangStringResponseSource = ((responseSourceJavaLangObjectNull) ? ("") : (responseSource));
                // read response.title == null ? "" : response.title
                responseTitleJavaLangObjectNullJavaLangStringResponseTitle = ((responseTitleJavaLangObjectNull) ? ("") : (responseTitle));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.layoutArticle.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvArticleAuthor, responseSourceJavaLangObjectNullJavaLangStringResponseSource);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvArticleDate, responsePublishedDateJavaLangObjectNullJavaLangStringResponsePublishedDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvArticleName, responseTitleJavaLangObjectNullJavaLangStringResponseTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // response
        com.app.nytimes.model.entities.ArticlesResponse response = mResponse;
        // adapter
        com.app.nytimes.ui.home.ArticlesAdapter adapter = mAdapter;
        // adapter != null
        boolean adapterJavaLangObjectNull = false;



        adapterJavaLangObjectNull = (adapter) != (null);
        if (adapterJavaLangObjectNull) {



            adapter.observeItemClick(response);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): response
        flag 1 (0x2L): adapter
        flag 2 (0x3L): null
        flag 3 (0x4L): response.publishedDate == null ? "" : response.publishedDate
        flag 4 (0x5L): response.publishedDate == null ? "" : response.publishedDate
        flag 5 (0x6L): response.source == null ? "" : response.source
        flag 6 (0x7L): response.source == null ? "" : response.source
        flag 7 (0x8L): response.title == null ? "" : response.title
        flag 8 (0x9L): response.title == null ? "" : response.title
    flag mapping end*/
    //end
}