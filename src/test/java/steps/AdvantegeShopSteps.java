package steps;

import api.ApiParams;
import api.ApiRequest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;


//https://www.advantageonlineshopping.com/catalog/api/v1/products/search
//https://www.advantageonlineshopping.com/catalog/api/v1/product/image/{userId}/{source}/{color}

public class AdvantegeShopSteps extends ApiRequest {

    private String url = "https://www.advantageonlineshopping.com/catalog/api/v1/products/search";
    private String categoria = "";
    private ApiParams apiParams = new ApiParams();

    @Dado("que quero pesquisar pelo produto {word}")
    public void queQueroPesquisarPeloProdutoMice(String categoria) {
        this.categoria = categoria;
    }

    @Quando("realizo a requisição")
    public void realizoARequisicao() {
        super.url = url;
        super.queryParams = apiParams.queryParams(categoria, 3);
        GET();
    }

    @Entao("valido que o status code é {int}")
    public void validoQueOStatusCodeE(int arg0) {
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @E("valido que a categoria retornada é Mice")
    public void validoQueACategoriaRetornadaEMice() {
    }
}