from django.shortcuts import render


def hw(request):
    return render(request, 'hello.html', {'hello': 'TestModel_hw_value', 'p': 'tag p'})
