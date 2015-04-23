
  package gen;
  public class Z_Gen72 {
  		@com.google.inject.Inject
  		public Z_Gen72(Z_Gen73 z_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  