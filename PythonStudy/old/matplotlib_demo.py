import matplotlib.pyplot as plt
import numpy as np

data = np.arange(10)

fig = plt.figure()
ax = fig.add_subplot(111)
ax.set(xlim=[0, 10], ylim=[0, 10], title='An Example Axes',
       ylabel='Y-Axis', xlabel='X-Axis')
ax.plot(data)
plt.show()
