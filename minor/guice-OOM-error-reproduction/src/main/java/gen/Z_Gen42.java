
  package gen;
  public class Z_Gen42 {
  		@com.google.inject.Inject
  		public Z_Gen42(Z_Gen43 z_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  