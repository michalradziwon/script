
  package gen;
  public class Z_Gen88 {
  		@com.google.inject.Inject
  		public Z_Gen88(Z_Gen89 z_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  