
  package gen;
  public class Z_Gen152 {
  		@com.google.inject.Inject
  		public Z_Gen152(Z_Gen153 z_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  