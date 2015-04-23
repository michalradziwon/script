
  package gen;
  public class R_Gen176 {
  		@com.google.inject.Inject
  		public R_Gen176(R_Gen177 r_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  