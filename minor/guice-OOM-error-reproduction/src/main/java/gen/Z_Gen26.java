
  package gen;
  public class Z_Gen26 {
  		@com.google.inject.Inject
  		public Z_Gen26(Z_Gen27 z_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  