
  package gen;
  public class R_Gen56 {
  		@com.google.inject.Inject
  		public R_Gen56(R_Gen57 r_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  