from django.db import models


class Test(models.Model):
    name = models.CharField(max_length=20)

    def __str__(self):
        return self.name
