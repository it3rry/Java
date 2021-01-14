package main

import (
	"fmt"
	"html/template"
	"net/http"
)

func sayHello(w http.ResponseWriter, r *http.Request){
	//解析模板
	t, err := template.ParseFiles("./hello.tmpl")

	if err != nil {
		fmt.Printf("parse template failed, err:%v", err)
	}

	//渲染模板
	_ = t.Execute(w, "小伙子")
	if err != nil {
		fmt.Printf("render template failed, err: %v", err)
	}
}

func main() {
	http.HandleFunc("/", sayHello)

	err := http.ListenAndServe(":9000", nil)
	if err != nil {
		fmt.Printf("http server start failed, err:%v", err)
		return
	}
}
