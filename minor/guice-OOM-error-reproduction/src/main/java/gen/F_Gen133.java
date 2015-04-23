
  package gen;
  public class F_Gen133 {
  		@com.google.inject.Inject
  		public F_Gen133(F_Gen134 f_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  