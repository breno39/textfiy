FROM eclipse-temurin:19.0.1_10-jdk-jammy

ARG THE_USER_ID=1001
ARG THE_GROUP_ID=1001
RUN \
  /usr/sbin/groupadd -g $THE_GROUP_ID spring && \
  /usr/sbin/useradd -l -u $THE_USER_ID -G spring -g $THE_GROUP_ID spring && \
  mkdir logs && chgrp spring logs && chmod ug+rwx logs

USER spring:spring

EXPOSE 8080

COPY springBoot.jar springBoot.jar
CMD ["java","-jar","springBoot.jar"]

