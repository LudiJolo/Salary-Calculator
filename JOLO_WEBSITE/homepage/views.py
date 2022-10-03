from django.shortcuts import render
from django.http import HttpResponse, JsonResponse
from .models import Skill, Education
# Create your views here.

def index(request):
    return render(request, 'home/index.html',{
        'skills': Skill.objects.all(),
        'educations': Education.objects.all()
    })


