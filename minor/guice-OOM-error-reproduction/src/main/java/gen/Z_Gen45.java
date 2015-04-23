
  package gen;
  public class Z_Gen45 {
  		@com.google.inject.Inject
  		public Z_Gen45(Z_Gen46 z_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  