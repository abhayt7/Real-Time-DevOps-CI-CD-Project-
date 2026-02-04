provider "aws" {
  region = "us-east-1"
}

resource "aws_instance" "jenkins" {
  ami           = "ami-0f5ee92e2d63afc18"
  instance_type = "t3.medium"

  tags = {
    Name = "jenkins-server"
  }
}

