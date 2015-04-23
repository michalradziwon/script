
  package gen;
  public class Z_Gen48 {
  		@com.google.inject.Inject
  		public Z_Gen48(Z_Gen49 z_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  