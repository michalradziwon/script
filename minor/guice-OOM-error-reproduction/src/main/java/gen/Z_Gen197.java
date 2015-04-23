
  package gen;
  public class Z_Gen197 {
  		@com.google.inject.Inject
  		public Z_Gen197(Z_Gen198 z_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  