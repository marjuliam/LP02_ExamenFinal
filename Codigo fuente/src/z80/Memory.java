/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z80;

/**
 *
 * @author Zylfrox
 */
public class Memory
{
    private String id;
    private String C0;
    private String C1;
    private String C2;
    private String C3;
    private String C4;
    private String C5;
    private String C6;
    private String C7;
    private String C8;
    private String C9;
    private String CA;
    private String CB;
    private String CC;
    private String CD;
    private String CE;
    private String CF;

        public Memory(String id, String C0, String C1, String C2, String C3, String C4, String C5, String C6, String C7, String C8, String C9, String CA, String CB, String CC, String CD, String CE, String CF) {
            this.id = id;
            this.C0 = C0;
            this.C1 = C1;
            this.C2 = C2;
            this.C3 = C3;
            this.C4 = C4;
            this.C5 = C5;
            this.C6 = C6;
            this.C7 = C7;
            this.C8 = C8;
            this.C9 = C9;
            this.CA = CA;
            this.CB = CB;
            this.CC = CC;
            this.CD = CD;
            this.CE = CE;
            this.CF = CF;
        }

        public String getId() {
            return id;
        }

        public String getC0() {
            return C0;
        }

        public String getC1() {
            return C1;
        }

        public String getC2() {
            return C2;
        }

        public String getC3() {
            return C3;
        }

        public String getC4() {
            return C4;
        }

        public String getC5() {
            return C5;
        }

        public String getC6() {
            return C6;
        }

        public String getC7() {
            return C7;
        }

        public String getC8() {
            return C8;
        }

        public String getC9() {
            return C9;
        }

        public String getCA() {
            return CA;
        }

        public String getCB() {
            return CB;
        }

        public String getCC() {
            return CC;
        }

        public String getCD() {
            return CD;
        }

        public String getCE() {
            return CE;
        }

        public String getCF() {
            return CF;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setC0(String C0) {
            this.C0 = C0;
        }

        public void setC1(String C1) {
            this.C1 = C1;
        }

        public void setC2(String C2) {
            this.C2 = C2;
        }

        public void setC3(String C3) {
            this.C3 = C3;
        }

        public void setC4(String C4) {
            this.C4 = C4;
        }

        public void setC5(String C5) {
            this.C5 = C5;
        }

        public void setC6(String C6) {
            this.C6 = C6;
        }

        public void setC7(String C7) {
            this.C7 = C7;
        }

        public void setC8(String C8) {
            this.C8 = C8;
        }

        public void setC9(String C9) {
            this.C9 = C9;
        }

        public void setCA(String CA) {
            this.CA = CA;
        }

        public void setCB(String CB) {
            this.CB = CB;
        }

        public void setCC(String CC) {
            this.CC = CC;
        }

        public void setCD(String CD) {
            this.CD = CD;
        }

        public void setCE(String CE) {
            this.CE = CE;
        }

        public void setCF(String CF) {
            this.CF = CF;
        }
}