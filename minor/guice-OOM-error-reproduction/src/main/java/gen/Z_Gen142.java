
  package gen;
  public class Z_Gen142 {
  		@com.google.inject.Inject
  		public Z_Gen142(Z_Gen143 z_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  