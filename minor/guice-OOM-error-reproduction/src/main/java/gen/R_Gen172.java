
  package gen;
  public class R_Gen172 {
  		@com.google.inject.Inject
  		public R_Gen172(R_Gen173 r_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  