
  package gen;
  public class R_Gen141 {
  		@com.google.inject.Inject
  		public R_Gen141(R_Gen142 r_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  