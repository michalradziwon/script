
  package gen;
  public class Z_Gen55 {
  		@com.google.inject.Inject
  		public Z_Gen55(Z_Gen56 z_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  