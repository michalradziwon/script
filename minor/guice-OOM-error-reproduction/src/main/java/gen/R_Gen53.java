
  package gen;
  public class R_Gen53 {
  		@com.google.inject.Inject
  		public R_Gen53(R_Gen54 r_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  