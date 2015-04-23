
  package gen;
  public class R_Gen58 {
  		@com.google.inject.Inject
  		public R_Gen58(R_Gen59 r_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  