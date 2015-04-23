
  package gen;
  public class R_Gen157 {
  		@com.google.inject.Inject
  		public R_Gen157(R_Gen158 r_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  