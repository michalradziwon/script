
  package gen;
  public class Z_Gen28 {
  		@com.google.inject.Inject
  		public Z_Gen28(Z_Gen29 z_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  