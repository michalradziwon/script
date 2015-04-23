
  package gen;
  public class D_Gen77 {
  		@com.google.inject.Inject
  		public D_Gen77(D_Gen78 d_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  