
  package gen;
  public class R_Gen147 {
  		@com.google.inject.Inject
  		public R_Gen147(R_Gen148 r_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  