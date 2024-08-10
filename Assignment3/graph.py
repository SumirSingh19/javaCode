import matplotlib.pyplot as plt

iterations = [100000, 200000, 300000]
string_times = [720, 2220, 4623]
string_buffer_times = [4, 6, 8]
string_builder_times = [2, 2, 3]

plt.plot(iterations, string_times, label="String", color='blue', linestyle='-')
plt.plot(iterations, string_buffer_times, label="StringBuffer", color='red', linestyle='--')
plt.plot(iterations, string_builder_times, label="StringBuilder", color='green', linestyle='-.')
plt.xlabel("Iterations")
plt.ylabel("Execution Time(ms)")
plt.title("String vs StringBuffer vs StringBuilder Execution Time")

plt.legend()

plt.savefig('plot.png')
plt.show()