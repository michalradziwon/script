
  package gen;
  public class Z_Gen104 {
  		@com.google.inject.Inject
  		public Z_Gen104(Z_Gen105 z_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  