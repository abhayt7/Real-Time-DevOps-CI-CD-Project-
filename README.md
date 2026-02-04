# Real-Time-DevOps-CI-CD-Project-
Enterprise CI/CD Pipeline for Java Application using AWS, Jenkins, Docker, Kubernetes &amp; Terraform

Real-Time Architecture
Developer → GitHub → Jenkins CI/CD → SonarQube → Docker → AWS ECR → Terraform → AWS EKS → Kubernetes → Production

| Layer                   | Tools            |
| ----------------------- | ---------------- |
| SCM                     | Git, GitHub      |
| CI                      | Jenkins          |
| Build                   | Maven            |
| Code Quality            | SonarQube        |
| Image                   | Docker           |
| Infra                   | Terraform        |
| Cloud                   | AWS              |
| Container Orchestration | Kubernetes (EKS) |
| Registry                | AWS ECR          |


Real-Time Flow (Industry Pipeline)

Developer pushes code → GitHub

Webhook triggers Jenkins

Jenkins pulls code

Maven builds application

SonarQube scans code

Docker builds image

Image pushed to AWS ECR

Terraform provisions infra (EKS + VPC + EC2 + IAM)

Jenkins deploys app to Kubernetes


