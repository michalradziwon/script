
  package gen;
  public class Z_Gen160 {
  		@com.google.inject.Inject
  		public Z_Gen160(Z_Gen161 z_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  