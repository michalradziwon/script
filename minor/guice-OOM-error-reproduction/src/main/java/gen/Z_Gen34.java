
  package gen;
  public class Z_Gen34 {
  		@com.google.inject.Inject
  		public Z_Gen34(Z_Gen35 z_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  