
  package gen;
  public class F_Gen169 {
  		@com.google.inject.Inject
  		public F_Gen169(F_Gen170 f_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  