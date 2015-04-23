
  package gen;
  public class Z_Gen4 {
  		@com.google.inject.Inject
  		public Z_Gen4(Z_Gen5 z_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  