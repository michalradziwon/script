
  package gen;
  public class R_Gen61 {
  		@com.google.inject.Inject
  		public R_Gen61(R_Gen62 r_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  