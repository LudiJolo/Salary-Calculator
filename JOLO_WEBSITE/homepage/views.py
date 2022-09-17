from django.shortcuts import render
from django.http import HttpResponse, JsonResponse
from .models import Skill, Education
from django.core.mail import send_mail, EmailMessage
# Create your views here.

def index(request):
    return render(request, 'home/index.html',{
        'skills': Skill.objects.all(),
        'educations': Education.objects.all()
    })

def messageEmail(request):
    if request.method == "POST":
        message_name = request.POST.get("name")
        message_email = request.POST.get("email")
        message_subject = request.POST.get("subject")
        message = request.POST.get("message")

        full_msg = ("You received a message from: " + message_name +
                    "\nEmail: " + message_email + "\n" + message)

        send_mail(message_subject, full_msg, message_email, ['joloh18@yahoo.com', 'jolohernandez18@yahoo.com'])

        return render(request, 'home/messagesent.html', {'message_name': message_name})

    else:
        return render(request, 'home/index.html', {})


