
  package gen;
  public class Z_Gen87 {
  		@com.google.inject.Inject
  		public Z_Gen87(Z_Gen88 z_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  