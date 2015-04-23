
  package gen;
  public class R_Gen181 {
  		@com.google.inject.Inject
  		public R_Gen181(R_Gen182 r_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  