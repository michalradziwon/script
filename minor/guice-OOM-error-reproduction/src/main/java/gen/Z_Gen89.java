
  package gen;
  public class Z_Gen89 {
  		@com.google.inject.Inject
  		public Z_Gen89(Z_Gen90 z_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  