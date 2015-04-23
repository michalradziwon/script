
  package gen;
  public class R_Gen130 {
  		@com.google.inject.Inject
  		public R_Gen130(R_Gen131 r_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  