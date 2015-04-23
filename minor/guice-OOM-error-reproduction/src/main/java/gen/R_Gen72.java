
  package gen;
  public class R_Gen72 {
  		@com.google.inject.Inject
  		public R_Gen72(R_Gen73 r_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  