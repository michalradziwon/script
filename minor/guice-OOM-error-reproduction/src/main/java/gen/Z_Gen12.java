
  package gen;
  public class Z_Gen12 {
  		@com.google.inject.Inject
  		public Z_Gen12(Z_Gen13 z_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  