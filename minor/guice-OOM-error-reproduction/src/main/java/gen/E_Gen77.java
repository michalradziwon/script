
  package gen;
  public class E_Gen77 {
  		@com.google.inject.Inject
  		public E_Gen77(E_Gen78 e_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  