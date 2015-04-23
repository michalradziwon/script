
  package gen;
  public class Z_Gen137 {
  		@com.google.inject.Inject
  		public Z_Gen137(Z_Gen138 z_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  