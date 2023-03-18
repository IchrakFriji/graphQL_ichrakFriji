package graph.repositories;

import java.util.ArrayList;
import java.util.List;

import graph.entities.Student;

public class StudentRepository {
  private List<Student> students;

  public StudentRepository() {
    students = new ArrayList<>();
    students.add(new Student("12333449", "ichrak friji", "ichrak.friji@esprit.tn"));
    students.add(new Student("04335566", "asma ben ahmed", "asma@esprit.tn"));
  }

  public List<Student> allStudents() {
    return students;
  }

  public void saveStudent(Student student) {
    students.add(student);
  }
}