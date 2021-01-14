package main
// querystring
import (
	"github.com/gin-gonic/gin"
)

func main() {
	r := gin.Default()

	r.GET("/web", func(c *gin.Context) {

	})

	_ = r.Run(":9090")

}
