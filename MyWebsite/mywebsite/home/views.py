from django.shortcuts import render
from django.http import HttpResponse, JsonResponse
from django.core.mail import send_mail, EmailMessage
# Create your views here.

def index(request):
    #return render(request, 'home/index.html')
    return HttpResponse("Jolo's Website")
