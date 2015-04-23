
  package gen;
  public class Z_Gen70 {
  		@com.google.inject.Inject
  		public Z_Gen70(Z_Gen71 z_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  