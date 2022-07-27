from django.db import models
from django.core.validators import MaxValueValidator, MinValueValidator
# Create your models here.
class Skill(models.Model):
    name = models.CharField(max_length=64)
    level = models.IntegerField()
    description = models.CharField(max_length=200)
    icon_html = models.CharField(max_length=200, default='fa-solid fa-question')
    def __str__(self):
        return f"{self.name}: {self.level}"


class Education(models.Model):
    schoolName = models.CharField(max_length=150)
    degree = models.CharField(max_length=150)
    startYear = models.IntegerField(validators=[MinValueValidator(1900), MaxValueValidator(2999)])
    endYear = models.IntegerField(validators=[MinValueValidator(1900), MaxValueValidator(2999)],null=True)
    logo = models.ImageField(null=True, blank=True)

    def __str__(self):
        return f"{self.schoolName}"
