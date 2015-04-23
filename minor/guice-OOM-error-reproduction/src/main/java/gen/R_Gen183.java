
  package gen;
  public class R_Gen183 {
  		@com.google.inject.Inject
  		public R_Gen183(R_Gen184 r_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  