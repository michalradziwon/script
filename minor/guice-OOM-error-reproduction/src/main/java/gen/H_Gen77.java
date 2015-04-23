
  package gen;
  public class H_Gen77 {
  		@com.google.inject.Inject
  		public H_Gen77(H_Gen78 h_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  