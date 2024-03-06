package com.ohgiraffers.section02.preparedstatement;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application3 {
    public static void main(String[] args) {

        /* Scanner를 이용해서 사번을 입력받아 사원의 정보를 EmployeeDTO 객체에 담아서 출력 */
        Connection con = getConnection();

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        EmployeeDTO selectdeEmp = null;

        Scanner sc = new Scanner(System.in);
        System.out.print(" 조회하실 사번을 입력해주세요 : ");
        String empId = sc.nextLine();

        String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID = ?";

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, empId);

            rset = pstmt.executeQuery();

            if(rset.next()) {
                selectdeEmp = new EmployeeDTO();

                selectdeEmp.setEmpId(rset.getString("EMP_ID"));
                selectdeEmp.setEmpName(rset.getString("EMP_NAME"));
                selectdeEmp.setEmpNo(rset.getString("EMP_NO"));
                selectdeEmp.setEmail(rset.getString("EMAIL"));
                selectdeEmp.setPhone(rset.getString("PHONE"));
                selectdeEmp.setDeptCode(rset.getString("DEPT_CODE"));
                selectdeEmp.setJobCode(rset.getString("JOB_CODE"));
                selectdeEmp.setSalLevel(rset.getString("SAL_LEVEL"));
                selectdeEmp.setSalary(rset.getInt("SALARY"));
                selectdeEmp.setBonus(rset.getDouble("BONUS"));
                selectdeEmp.setManagerId(rset.getString("MANAGER_ID"));
                selectdeEmp.setHireDate(rset.getDate("HIRE_DATE"));
                selectdeEmp.setEntDate(rset.getDate("ENT_DATE"));
                selectdeEmp.setEntYn(rset.getString("ENT_YN"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }

        System.out.println("selectdeEmp = " + selectdeEmp);
    }
}
