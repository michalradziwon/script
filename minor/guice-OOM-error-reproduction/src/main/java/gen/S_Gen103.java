
  package gen;
  public class S_Gen103 {
  		@com.google.inject.Inject
  		public S_Gen103(S_Gen104 s_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  