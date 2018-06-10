package co.androidbaseappkotlinmvvm.di.modules

import android.app.Application
import android.content.Context
import co.androidbaseappkotlinmvvm.common.ImageLoader
import co.androidbaseappkotlinmvvm.common.PicassoImageLoader
import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    fun provideAppContext(application: Application): Context {
        return application.applicationContext
    }

    @Singleton
    @Provides
    fun provideImageLoader(context: Context) : ImageLoader {
        return PicassoImageLoader(Picasso.with(context))
    }
}