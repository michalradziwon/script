
  package gen;
  public class Z_Gen25 {
  		@com.google.inject.Inject
  		public Z_Gen25(Z_Gen26 z_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  