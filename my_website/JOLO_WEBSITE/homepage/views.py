from django.shortcuts import render
from django.http import HttpResponse
# Create your views here.

#renders html page
#creates a view by calling a function
#request argument represent http request that user made
def index(request):
    return HttpResponse("Hello, world")