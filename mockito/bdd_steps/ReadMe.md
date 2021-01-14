BDD : considers scenarios 

BDD steps : 

1. Given : create stub 
2. When : actual mehtod call/under test (Don't confuse with mockito's when with BDD's When)
3. Then : verify / assert

Note : Given and When both can be used to create stub, but if would be readable if we use Given to create stubs to match BDD steps.

#### example

        import static org.mockito.BDDMockito.*;

         Seller seller = mock(Seller.class);
         Shop shop = new Shop(seller);

         public void shouldBuyBread() throws Exception {
           //given
           given(seller.askForBread()).willReturn(new Bread());

           //when
           Goods goods = shop.buyBread();

           //then
           assertThat(goods, containBread());
         }

source : https://javadoc.io/static/org.mockito/mockito-core/3.7.0/org/mockito/Mockito.html#bdd_mockito
