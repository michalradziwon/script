
  package gen;
  public class Z_Gen31 {
  		@com.google.inject.Inject
  		public Z_Gen31(Z_Gen32 z_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  