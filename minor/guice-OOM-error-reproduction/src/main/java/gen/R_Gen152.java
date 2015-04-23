
  package gen;
  public class R_Gen152 {
  		@com.google.inject.Inject
  		public R_Gen152(R_Gen153 r_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  