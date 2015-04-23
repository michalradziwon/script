
  package gen;
  public class R_Gen11 {
  		@com.google.inject.Inject
  		public R_Gen11(R_Gen12 r_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  