
  package gen;
  public class A_Gen18 {
  		@com.google.inject.Inject
  		public A_Gen18(A_Gen19 a_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  