
  package gen;
  public class R_Gen92 {
  		@com.google.inject.Inject
  		public R_Gen92(R_Gen93 r_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  