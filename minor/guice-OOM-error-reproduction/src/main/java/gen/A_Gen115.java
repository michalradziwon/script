
  package gen;
  public class A_Gen115 {
  		@com.google.inject.Inject
  		public A_Gen115(A_Gen116 a_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  