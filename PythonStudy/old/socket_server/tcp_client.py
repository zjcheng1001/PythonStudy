import socket
import time


# 该地址为服务器的套接字地址
addr = (socket.gethostname(), 1234)
# 与服务器一样，创建客户端套接字
tcp_client_sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
# 使用套接字的connect方法向服务器发送连接请求
tcp_client_sock.connect(addr)

# 向服务器发送四条数据，其中最后一条是断开连接的消息
for data in ['zhangsan', 'lisi', 'wangwu', 'exit']:
    # 这里使用time.sleep方法挂起当前线程
    # 目的是为了让for循环发送的消息有一定时间间隔，避免对方接收的数据连在一起
    time.sleep(1)
    # 注意数据格式须为二进制，使用encode方法处理
    tcp_client_sock.send(data.encode())
    # 接收服务器发来的消息
    data = tcp_client_sock.recv(1024).decode()
    if data:
        print(data)
        continue
    tcp_client_sock.close()
