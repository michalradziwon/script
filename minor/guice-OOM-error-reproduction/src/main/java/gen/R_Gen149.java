
  package gen;
  public class R_Gen149 {
  		@com.google.inject.Inject
  		public R_Gen149(R_Gen150 r_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  