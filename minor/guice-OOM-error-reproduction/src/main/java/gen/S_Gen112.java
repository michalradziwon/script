
  package gen;
  public class S_Gen112 {
  		@com.google.inject.Inject
  		public S_Gen112(S_Gen113 s_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  