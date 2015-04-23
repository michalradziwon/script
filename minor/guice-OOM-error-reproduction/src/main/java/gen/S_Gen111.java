
  package gen;
  public class S_Gen111 {
  		@com.google.inject.Inject
  		public S_Gen111(S_Gen112 s_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  