
  package gen;
  public class R_Gen124 {
  		@com.google.inject.Inject
  		public R_Gen124(R_Gen125 r_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  