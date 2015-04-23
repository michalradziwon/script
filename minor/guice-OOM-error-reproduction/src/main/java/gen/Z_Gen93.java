
  package gen;
  public class Z_Gen93 {
  		@com.google.inject.Inject
  		public Z_Gen93(Z_Gen94 z_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  