
  package gen;
  public class Z_Gen90 {
  		@com.google.inject.Inject
  		public Z_Gen90(Z_Gen91 z_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  