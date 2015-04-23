
  package gen;
  public class Z_Gen63 {
  		@com.google.inject.Inject
  		public Z_Gen63(Z_Gen64 z_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  