import socket

ADDR = (socket.gethostname(), 1235)
tcp_client_sock = socket.socket()
tcp_client_sock.connect(ADDR)
print('Linked')

while True:
    data = input('Input your message:')
    if data and data != 'exit':
        tcp_client_sock.send(data.encode())
        reve_data = tcp_client_sock.recv(1024)
        if not reve_data or reve_data == 'exit':
            break
        print('Receiver message:', reve_data.decode())
        continue
    break