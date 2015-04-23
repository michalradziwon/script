
  package gen;
  public class R_Gen95 {
  		@com.google.inject.Inject
  		public R_Gen95(R_Gen96 r_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  