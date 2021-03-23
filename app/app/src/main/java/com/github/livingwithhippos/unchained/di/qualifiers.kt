package com.github.livingwithhippos.unchained.di

import javax.inject.Qualifier


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class AuthRetrofit

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ApiRetrofit

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class OriondroidRetrofit

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class TorrentNotification

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SummaryNotification
