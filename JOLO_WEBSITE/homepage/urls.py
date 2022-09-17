from django.urls import path
from . import views

app_name = 'homepage'
#stores all urls that are associated with the app
urlpatterns = [
    path('', views.index, name='index'),
    path('messagesent', views.messageEmail, name='messageEmail'),
]