
  package gen;
  public class R_Gen145 {
  		@com.google.inject.Inject
  		public R_Gen145(R_Gen146 r_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  