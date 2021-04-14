package com.app.nytimes.ui.home;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.app.nytimes.databinding.ItemArticleBinding;
import com.app.nytimes.model.entities.ArticlesResponse;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/app/nytimes/ui/home/ArticlesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/app/nytimes/ui/home/ArticlesAdapter$ArticlesViewHolder;", "dataSet", "", "Lcom/app/nytimes/model/entities/ArticlesResponse;", "listener", "Lcom/app/nytimes/ui/home/ArticlesAdapter$ArticleClick;", "(Ljava/util/List;Lcom/app/nytimes/ui/home/ArticlesAdapter$ArticleClick;)V", "getItemCount", "", "observeItemClick", "", "article", "onBindViewHolder", "viewHolder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "ArticleClick", "ArticlesViewHolder", "app_debug"})
public final class ArticlesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.app.nytimes.ui.home.ArticlesAdapter.ArticlesViewHolder> {
    private final java.util.List<com.app.nytimes.model.entities.ArticlesResponse> dataSet = null;
    private final com.app.nytimes.ui.home.ArticlesAdapter.ArticleClick listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.app.nytimes.ui.home.ArticlesAdapter.ArticlesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.app.nytimes.ui.home.ArticlesAdapter.ArticlesViewHolder viewHolder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void observeItemClick(@org.jetbrains.annotations.NotNull()
    com.app.nytimes.model.entities.ArticlesResponse article) {
    }
    
    public ArticlesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.app.nytimes.model.entities.ArticlesResponse> dataSet, @org.jetbrains.annotations.NotNull()
    com.app.nytimes.ui.home.ArticlesAdapter.ArticleClick listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/app/nytimes/ui/home/ArticlesAdapter$ArticlesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/app/nytimes/databinding/ItemArticleBinding;", "(Lcom/app/nytimes/databinding/ItemArticleBinding;)V", "getBinding", "()Lcom/app/nytimes/databinding/ItemArticleBinding;", "bind", "", "article", "Lcom/app/nytimes/model/entities/ArticlesResponse;", "Companion", "app_debug"})
    public static final class ArticlesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.app.nytimes.databinding.ItemArticleBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.app.nytimes.ui.home.ArticlesAdapter.ArticlesViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.app.nytimes.model.entities.ArticlesResponse article) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.nytimes.databinding.ItemArticleBinding getBinding() {
            return null;
        }
        
        public ArticlesViewHolder(@org.jetbrains.annotations.NotNull()
        com.app.nytimes.databinding.ItemArticleBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/app/nytimes/ui/home/ArticlesAdapter$ArticlesViewHolder$Companion;", "", "()V", "from", "Lcom/app/nytimes/ui/home/ArticlesAdapter$ArticlesViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.app.nytimes.ui.home.ArticlesAdapter.ArticlesViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/app/nytimes/ui/home/ArticlesAdapter$ArticleClick;", "", "onArticleClick", "", "article", "Lcom/app/nytimes/model/entities/ArticlesResponse;", "app_debug"})
    public static abstract interface ArticleClick {
        
        public abstract void onArticleClick(@org.jetbrains.annotations.NotNull()
        com.app.nytimes.model.entities.ArticlesResponse article);
    }
}