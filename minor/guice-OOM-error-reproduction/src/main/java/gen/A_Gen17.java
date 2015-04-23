
  package gen;
  public class A_Gen17 {
  		@com.google.inject.Inject
  		public A_Gen17(A_Gen18 a_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  