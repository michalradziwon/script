
  package gen;
  public class R_Gen155 {
  		@com.google.inject.Inject
  		public R_Gen155(R_Gen156 r_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  