import socket 
s = socket.socket()
print("** Socket sucessfully Created ** \n")
port = 9000
s.bind(('',port)) #takes ip address and port 
print(f'Socket binded to port{port} \n')
s.listen(6) #listen to atmost 6 connections
print('Socket is listening .... \n') 
while True:
    connection, addr =s.accept()  #connection from client and it's address
    print('Got Connection from', addr)
    print(' ')
    Message = input ("Write message to client: ") #Respond to the client
    print(' ')
    connection.send(Message.encode())
    connection.close()

