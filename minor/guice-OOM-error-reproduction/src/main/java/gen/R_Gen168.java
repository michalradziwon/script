
  package gen;
  public class R_Gen168 {
  		@com.google.inject.Inject
  		public R_Gen168(R_Gen169 r_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  