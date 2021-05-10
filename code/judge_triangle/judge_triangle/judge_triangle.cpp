// judge_triangle.cpp : 此文件包含 "main" 函数。程序执行将在此处开始并结束。
//Author: Yu Shuaiwen
//Department: 2018级计算机科学与技术
//Class Num: 1

//Date: 2021/5/1

#include <iostream>
#include <stdio.h>
using namespace std;
int main()
{
	char ch='Y';
	while (ch=='Y') {
		//输入设置
		int a, b, c;
		cout << "请依次输入三角形的三条边，各边以空格分开：\n";
		cin >> a >> b >> c;

		if (a <= 0 || a >= 200 || b <= 0 || b >= 200 || c <= 0 || c >= 200) {
			cout << "边的取值不符合要求，请检查后重新输入！\n";
		}
		else {
			if (a + b > c&& a + c > b&& b + c > a) {
				//正确的三角形
				if (a == b && b == c) {
					//等边三角形
					cout << "该三条边构成等边三角形！\n";
				}
				else if (a == b || b == c || c == a) {
					//等腰三角形
					cout << "该三条边构成等腰三角形！\n";
				}
				else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
					//直角三角形
					cout << "该三条边构成直角三角形！\n";
				}
				else {
					//普通三角形
					cout << "该三条边构成普通三角形！\n";
				}
			}
			else {
				//构不成三角形
				cout << "该三条边构不成三角形！\n";
			}
		}
		cout << "继续运行请输入'Y'，否则输入'N'\n";
		cin >> ch;
	}
	if (ch == 'N') cout << "程序结束！\n";
	return 0;
}
