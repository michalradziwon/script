
  package gen;
  public class R_Gen197 {
  		@com.google.inject.Inject
  		public R_Gen197(R_Gen198 r_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  