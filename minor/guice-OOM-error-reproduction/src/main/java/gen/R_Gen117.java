
  package gen;
  public class R_Gen117 {
  		@com.google.inject.Inject
  		public R_Gen117(R_Gen118 r_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  