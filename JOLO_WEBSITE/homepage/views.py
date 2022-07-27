from django.shortcuts import render
from django.http import HttpResponse, JsonResponse
from about.models import Skill, Education
# Create your views here.

def index(request):
    return render(request, 'home/index.html',{
        'skills': Skill.objects.all(),
        'educations': Education.objects.all()
    })

def skills(request):
    start = 0
    end = len(Skill.objects.all())-1
    data = Skill.objects.all()
    
    return JsonResponse({
        'skills': data
    })

