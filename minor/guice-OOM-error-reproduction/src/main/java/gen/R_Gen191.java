
  package gen;
  public class R_Gen191 {
  		@com.google.inject.Inject
  		public R_Gen191(R_Gen192 r_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  