
  package gen;
  public class Z_Gen148 {
  		@com.google.inject.Inject
  		public Z_Gen148(Z_Gen149 z_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  