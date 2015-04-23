
  package gen;
  public class R_Gen26 {
  		@com.google.inject.Inject
  		public R_Gen26(R_Gen27 r_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  