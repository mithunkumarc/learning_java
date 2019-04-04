#### rx java examples

        https://github.com/ReactiveX/RxJava

#### dependency : pom

        <dependencies>  
              <dependency>
                  <groupId>io.reactivex.rxjava2</groupId>
                  <artifactId>rxjava</artifactId>
                  <version>2.2.8</version>
              </dependency>
        </dependencies>


#### module-info.java

          module reactive {
            requires io.reactivex.rxjava2;
            requires org.reactivestreams;
            //exports example to io.reactivex.rxjava2;
          }

#### program

            package example;

            import io.reactivex.*;

            public class Test {
              public static void main(String[] args) {
                //https://github.com/ReactiveX/RxJava

                    Flowable.just("Hello world").subscribe(System.out::println);	

                    Flowable<Integer> flow = Flowable.range(1, 5)
                        .map(v -> v * v)
                        .filter(v -> v % 3 == 0);
                    flow.subscribe(System.out::println);
              }
            }
