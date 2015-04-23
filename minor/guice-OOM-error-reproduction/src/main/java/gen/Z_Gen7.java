
  package gen;
  public class Z_Gen7 {
  		@com.google.inject.Inject
  		public Z_Gen7(Z_Gen8 z_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  