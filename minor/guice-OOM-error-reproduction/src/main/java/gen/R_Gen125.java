
  package gen;
  public class R_Gen125 {
  		@com.google.inject.Inject
  		public R_Gen125(R_Gen126 r_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  