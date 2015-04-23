
  package gen;
  public class Z_Gen130 {
  		@com.google.inject.Inject
  		public Z_Gen130(Z_Gen131 z_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  