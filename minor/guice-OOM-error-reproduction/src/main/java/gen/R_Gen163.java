
  package gen;
  public class R_Gen163 {
  		@com.google.inject.Inject
  		public R_Gen163(R_Gen164 r_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  