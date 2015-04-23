
  package gen;
  public class R_Gen154 {
  		@com.google.inject.Inject
  		public R_Gen154(R_Gen155 r_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  