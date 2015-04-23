
  package gen;
  public class R_Gen171 {
  		@com.google.inject.Inject
  		public R_Gen171(R_Gen172 r_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  