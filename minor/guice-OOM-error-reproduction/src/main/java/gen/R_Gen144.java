
  package gen;
  public class R_Gen144 {
  		@com.google.inject.Inject
  		public R_Gen144(R_Gen145 r_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  