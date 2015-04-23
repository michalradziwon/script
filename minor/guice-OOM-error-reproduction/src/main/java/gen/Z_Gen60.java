
  package gen;
  public class Z_Gen60 {
  		@com.google.inject.Inject
  		public Z_Gen60(Z_Gen61 z_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  