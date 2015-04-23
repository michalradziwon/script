
  package gen;
  public class Z_Gen84 {
  		@com.google.inject.Inject
  		public Z_Gen84(Z_Gen85 z_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  