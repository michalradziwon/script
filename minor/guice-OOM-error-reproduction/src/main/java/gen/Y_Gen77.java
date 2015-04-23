
  package gen;
  public class Y_Gen77 {
  		@com.google.inject.Inject
  		public Y_Gen77(Y_Gen78 y_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  