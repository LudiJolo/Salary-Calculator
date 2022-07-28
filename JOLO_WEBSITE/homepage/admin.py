from django.contrib import admin
from .models import Skill, Education
# Register your models here.
class SkillAdmin(admin.ModelAdmin):
    list_display = ("name", "level", "description")

class EducationAdmin(admin.ModelAdmin):
    list_display = ("schoolName", "degree", "startYear", "endYear")

admin.site.register(Skill, SkillAdmin)
admin.site.register(Education, EducationAdmin)