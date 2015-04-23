
  package gen;
  public class R_Gen68 {
  		@com.google.inject.Inject
  		public R_Gen68(R_Gen69 r_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  