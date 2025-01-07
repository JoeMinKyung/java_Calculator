# Calculator
> 이 프로젝트는 간단한 계산기 프로그램입니다. 사용자가 입력한 두 숫자와 연산자를 바탕으로 사칙연산(더하기, 빼기, 곱하기, 나누기)을 수행합니다. 사용자가 계산을 계속할 수 있도록 기능을 제공하며, exit 명령어를 입력하면 프로그램이 종료됩니다.

<br>

## Table of Contents
* [Technologies Used](#technologies-used)
* [Calculator1_info](#calculator1_info)
* [Calculator1_Features](#Calculator1_Features)
* [Calculator1_Screenshots](#Calculator1_Screenshots)
* [Calculator1_Usage](#Calculator1_Usage)
* [Contact](#contact)

  <br>
## Technologies Used
<div align=center> 
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> 
    <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
</div>

<br>

- **Java**
  - 계산기 로직과 사용자 입력 처리를 위한 핵심 프로그래밍 언어로 사용되었습니다. 반복문, 조건문, 예외 처리(try-catch) 등을 활용하여 프로그램의 안정성을 확보했습니다.

  - **Scanner**

    - 사용자 입력을 콘솔에서 받아오는 데 사용되었습니다. Scanner 클래스는 숫자와 연산자를 입력받는 데 사용됩니다.
  - **ArrayList**
    - 계산된 결과를 저장하고 관리하는 데 사용되었습니다. 동적으로 결과를 저장하고, 이를 쉽게 조회하거나 수정할 수 있도록 ArrayList를 활용했습니다.
  - **캡슐화 (Encapsulation)**
    - 계산기의 연산 결과는 private 필드로 캡슐화되어 있으며, 해당 필드를 수정하거나 조회할 수 있도록 public getter와 setter 메서드가 제공되어 올바른 접근을 보장합니다.
  - **Switch-Case**
    - 사용자가 입력한 연산자에 따라 사칙연산(+, -, *, /)을 처리하기 위해 switch-case 문을 사용했습니다. 이를 통해 프로그램을 모듈화하고 향후 추가적인 연산을 쉽게 확장할 수 있도록 했습니다.
  - **예외 처리 (try-catch)**
    - 정수 입력 오류나 0으로 나누기 오류 등을 처리하기 위해 예외 처리 기법을 사용하여, 프로그램이 예기치 않게 종료되지 않고 의미 있는 오류 메시지를 제공하도록 했습니다.

<br>

## Calculator1_info
### `Calculator.java`
> `Calculator` 클래스는 기본적인 사칙연산을 처리하며, 사용자에게 두 숫자와 연산자를 입력받고, 계산 결과를 출력합니다. 이 클래스에서는 결과를 저장하지 않고, 매번 계산 후 출력합니다. `exit`를 입력하기 전까지 연사을 계속해서 할 수 있습니다.

- **`input`**

  - `while` 문을 사용해 사용자의 입력을 계속해서 받습니다. (`exit` 입력 전까지)
  
  - `while` 문과 `try-catch` 문을 사용하여 입력된 문자가 **유효한 양의 정수인지 계속해서 판별**합니다.
  
  - `while` 문과 `try-catch` 문을 사용하여 입력된 문자가 **유효한 연산자인지 계속해서 판별**합니다.

 
- **`operations`** 

  - 사칙연산 수행 시 `validOperation` 변수를 사용하여 나눗셈 연산에서 분모에 0이 들어가는 오류를 처리합니다. 

- **`Operation finished`**
  
  - 연산을 계속하려면 아무 키나 누르고, 연산을 종료하고 싶으면 `exit`를 입력합니다.

<br>

## Calculator1_Features

- 양의 정수(0 포함) 두 개를 입력받아 사칙연산을 수행합니다.

- 입력한 연산 기호에 맞춰 연산을 진행합니다. (사칙연산 기호: `+`, `-`, `*`, `/`)

- 나누기 연산 시, 0으로 나누는 오류를 처리합니다.

- 사용자가 연산을 계속할지 종료할지 선택할 수 있습니다. (입력 exit 시 종료)

<br>


## Calculator1_Screenshots

![image](https://github.com/user-attachments/assets/b43e8e23-b144-4b45-bb0b-e5434c9e6459)
![image](https://github.com/user-attachments/assets/575e0a63-aaba-4118-9194-6ae9db12b335)

<br>

## Calculator1_Usage
1. 프로그램 실행 후, 첫 번째 숫자를 입력합니다.
2. 두 번째 숫자를 입력합니다.
3. 사칙연산 기호(+, -, *, /)를 입력합니다.
4. 연산 결과가 출력됩니다.
5. 연산을 계속하려면 아무 키나 누르고, 종료하려면 exit을 입력합니다.

<br>

## Contact
Created by 
[@JoeMinKyung](https://github.com/JoeMinKyung)
<br>

문의사항이 있다면 언제든지 연락주세요!
