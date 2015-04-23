
  package gen;
  public class R_Gen170 {
  		@com.google.inject.Inject
  		public R_Gen170(R_Gen171 r_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  