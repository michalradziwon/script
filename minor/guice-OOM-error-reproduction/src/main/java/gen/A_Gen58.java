
  package gen;
  public class A_Gen58 {
  		@com.google.inject.Inject
  		public A_Gen58(A_Gen59 a_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  