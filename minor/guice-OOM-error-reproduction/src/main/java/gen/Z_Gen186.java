
  package gen;
  public class Z_Gen186 {
  		@com.google.inject.Inject
  		public Z_Gen186(Z_Gen187 z_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  