import socket
s = socket.socket()
port = 9000
s.connect(('127.0.0.1', port))
print(' ')
print(s.recv(1024))
print(' ')
s.close