
  package gen;
  public class R_Gen116 {
  		@com.google.inject.Inject
  		public R_Gen116(R_Gen117 r_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  