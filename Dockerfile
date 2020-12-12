FROM ubuntu:latest  


RUN apt update -y
RUN apt install vim -y
RUN apt install htop -y
RUN apt install default-jre -y
RUN apt install default-jdk -y

WORKDIR /home/chess
ADD ./Server /home/chess
EXPOSE 80

ENTRYPOINT [ "javac" ]
CMD ["-cp . /Server/*java"]