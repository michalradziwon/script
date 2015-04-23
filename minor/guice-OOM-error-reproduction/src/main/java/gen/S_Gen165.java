
  package gen;
  public class S_Gen165 {
  		@com.google.inject.Inject
  		public S_Gen165(S_Gen166 s_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  