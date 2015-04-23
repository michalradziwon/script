
  package gen;
  public class Z_Gen49 {
  		@com.google.inject.Inject
  		public Z_Gen49(Z_Gen50 z_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  