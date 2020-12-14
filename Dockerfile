FROM ubuntu:latest  


RUN apt update -y
RUN apt install vim -y
RUN apt install htop -y
RUN apt install default-jre -y
RUN apt install default-jdk -y

WORKDIR /home/chess
ADD ./Source/Server /home/chess
EXPOSE 4200:4200 4201:4201 4202:4202

ENTRYPOINT [ "javac" ]
CMD ["-cp . /Server/*java"]