package main

import (
	"fmt"
	"html/template"
	"net/http"
)
type User struct {
	Name string
	gender string
	Age int
}

func sayHello(w http.ResponseWriter, r *http.Request){
	// 定义模板
	// 解析模板
	t, err := template.ParseFiles("./hello.tmpl")
	if err != nil {
		fmt.Println("parse template failed,err:%v", err)
	}

	u1 := User{"terry", "男", 18}

	// 渲染模板
	_ = t.Execute(w, u1)
}

func main() {
	http.HandleFunc("/", sayHello)

	err := http.ListenAndServe(":9000", nil)
	if err != nil {
		fmt.Printf("http server failed, err:%v", err)
		return
	}






}

