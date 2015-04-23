
  package gen;
  public class Z_Gen14 {
  		@com.google.inject.Inject
  		public Z_Gen14(Z_Gen15 z_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  