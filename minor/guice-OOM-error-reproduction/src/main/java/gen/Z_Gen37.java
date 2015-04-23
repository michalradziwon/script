
  package gen;
  public class Z_Gen37 {
  		@com.google.inject.Inject
  		public Z_Gen37(Z_Gen38 z_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  