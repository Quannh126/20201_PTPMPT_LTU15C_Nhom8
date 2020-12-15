FROM java:latest  

WORKDIR /home/server

ADD ./Source/Server/ /home/server

RUN javac -cp . ./*.java

ENTRYPOINT [ "java" ]
CMD [ "-cp",".","ChessServer" ]