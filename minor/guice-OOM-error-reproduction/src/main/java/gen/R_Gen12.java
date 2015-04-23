
  package gen;
  public class R_Gen12 {
  		@com.google.inject.Inject
  		public R_Gen12(R_Gen13 r_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  