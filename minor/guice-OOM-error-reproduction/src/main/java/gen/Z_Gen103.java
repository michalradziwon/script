
  package gen;
  public class Z_Gen103 {
  		@com.google.inject.Inject
  		public Z_Gen103(Z_Gen104 z_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  