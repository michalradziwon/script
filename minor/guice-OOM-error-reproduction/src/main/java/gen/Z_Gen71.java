
  package gen;
  public class Z_Gen71 {
  		@com.google.inject.Inject
  		public Z_Gen71(Z_Gen72 z_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  