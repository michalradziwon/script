
  package gen;
  public class S_Gen127 {
  		@com.google.inject.Inject
  		public S_Gen127(S_Gen128 s_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  